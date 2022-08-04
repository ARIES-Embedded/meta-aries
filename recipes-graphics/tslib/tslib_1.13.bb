SUMMARY = "An abstraction layer for touchscreen panel events"
DESCRIPTION = "Tslib is an abstraction layer for touchscreen panel \
events, as well as a filter stack for the manipulation of those events. \
Tslib is generally used on embedded devices to provide a common user \
space interface to touchscreen functionality."
HOMEPAGE = "http://tslib.berlios.de/"

AUTHOR = "Russell King w/ plugins by Chris Larson et. al."
SECTION = "base"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=f30a9716ef3762e3467a2f62bf790f0a"

SRC_URI = "https://github.com/kergoth/tslib/releases/download/${PV}/tslib-${PV}.tar.xz;downloadfilename=tslib-${PV}.tar.xz \
           file://ts.conf \
           file://tslib.sh \
"

SRC_URI[md5sum] = "14771f8607b341bb4b297819d37e837d"
SRC_URI[sha256sum] = "fe35e5f710ea933b118f710e2ce4403ac076fe69926b570333867d4de082a51c"

UPSTREAM_CHECK_URI = "https://github.com/kergoth/tslib/releases"

inherit autotools pkgconfig

EXTRA_OECONF = "--enable-shared --disable-h3600 --enable-input --disable-corgi --disable-collie --disable-mk712 --disable-arctic2 --disable-ucb1x00"

do_install:prepend() {
    install -m 0644 ${WORKDIR}/ts.conf ${S}/etc/ts.conf
}

do_install:append() {
    install -d ${D}${sysconfdir}/profile.d/
    install -m 0755 ${WORKDIR}/tslib.sh ${D}${sysconfdir}/profile.d/
}

# People should consider using udev's /dev/input/touchscreen0 symlink
# instead of detect-stylus
#RDEPENDS:tslib-conf_weird-machine = "detect-stylus"
RPROVIDES:tslib-conf = "libts-0.0-conf"

PACKAGES =+ "tslib-conf tslib-tests tslib-calibrate"
DEBIAN_NOAUTONAME:tslib-conf = "1"
DEBIAN_NOAUTONAME:tslib-tests = "1"
DEBIAN_NOAUTONAME:tslib-calibrate = "1"

RDEPENDS:${PN} = "tslib-conf"
RRECOMMENDS:${PN} = "pointercal"

FILES:${PN}-dev += "${libdir}/ts/*.la"
FILES:tslib-conf = "${sysconfdir}/ts.conf ${sysconfdir}/profile.d/tslib.sh ${datadir}/tslib"
FILES:${PN} = "${libdir}/*.so.* ${libdir}/ts/*.so*"
FILES:tslib-calibrate += "${bindir}/ts_calibrate"
FILES:tslib-tests = "${bindir}/ts_harvest ${bindir}/ts_print ${bindir}/ts_print_raw ${bindir}/ts_test"
