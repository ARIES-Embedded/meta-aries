require u-boot-common_${PV}.inc
require u-boot_2021.01.inc

DEPENDS += "dtc-native bc-native"

do_configure_append_maxevk () {
        install -m 644 ${WORKDIR}/hps.xml ${S}/quartus/
        install -m 644 ${WORKDIR}/output.rbf ${S}/quartus/
}

do_deploy_append_maxevk () {
        install -m 644 ${B}/fit_spl_fpga.itb ${DEPLOYDIR}/
}

do_configure_append_maxevk () {
        install -m 644 ${WORKDIR}/hps.xml ${S}/quartus/
        install -m 644 ${WORKDIR}/output.core.rbf ${S}/quartus/
        install -m 644 ${WORKDIR}/output.periph.rbf ${S}/quartus/
}

do_deploy_append_maxevk () {
        install -m 644 ${B}/fit_spl_fpga.itb ${DEPLOYDIR}/
}
