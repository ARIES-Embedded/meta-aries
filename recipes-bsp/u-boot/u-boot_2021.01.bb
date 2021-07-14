require u-boot-common_${PV}.inc
require u-boot_2021.01.inc

DEPENDS += "dtc-native bc-native"

do_configure_append_maxevk () {
	install -d ${S}/quartus/${MACHINE}/
	install -m 644 ${WORKDIR}/${MACHINE}/hps.xml ${S}/quartus/${MACHINE}/
	install -m 644 ${WORKDIR}/${MACHINE}/output.rbf ${S}/quartus/${MACHINE}/
}
do_deploy_append_maxevk () {
	install -m 644 ${B}/fit_spl_fpga_full.itb ${DEPLOYDIR}/fit_spl_fpga.itb
}
