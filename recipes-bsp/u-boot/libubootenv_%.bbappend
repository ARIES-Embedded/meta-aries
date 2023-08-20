FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://fw_env.config"

ALLOW_EMPTY:${PN} = "1"

do_install:append () {
    if [ "${PN}" = "libubootenv" ]; then
    	install -d ${D}${sysconfdir}
	install ${WORKDIR}/fw_env.config ${D}${sysconfdir}/fw_env.config
    fi
}

FILES:${PN} += " \
    ${sysconfdir}/fw_env.config \
"
