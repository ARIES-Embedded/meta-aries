SUMMARY = "Firmware files for use with Linux kernel for i.MX CPUs"
SECTION = "kernel"

LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://sdma-gen-image.c;beginline=1;endline=19;md5=8db9f935666ba755af54af9d8611b857"

SRCREV = "4aede1eb121e8199d33fe6697f4c91405086000a"
PV = "0.0+git${SRCPV}"

SRC_URI = "git://git.pengutronix.de/git/imx/sdma-firmware.git;protocol=git;branch=master"

S = "${WORKDIR}/git"

do_compile() {
	oe_runmake CC="${BUILD_CC}" CFLAGS="${BUILD_CFLAGS}" LDFLAGS="${BUILD_LDFLAGS}"
}

do_install() {
	install -d  ${D}/lib/firmware/
	install -d  ${D}/lib/firmware/imx/
	install -d  ${D}/lib/firmware/imx/sdma/
	cp -r *.bin ${D}/lib/firmware/imx/sdma/
}

FILES_${PN} += "/lib/firmware/imx/sdma/*"
