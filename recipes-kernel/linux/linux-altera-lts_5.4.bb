LINUX_VERSION = "5.4.84"
LINUX_VERSION_SUFFIX = "-lts"

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

SRCREV = "d9c44bbfc78be31e2cc2931502965197914d826f"

include linux-altera.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/config::${THISDIR}/linux-altera-lts-5.4:"

SRC_URI_append_mcvevk = " \
	file://lbdaf.scc \
	file://0001-socfpga-mcvevk-clean-up-model-names-in-device-tree-f.patch \
	file://0002-socfpga-mcvevk-framebuffer-support-for-the-Altera-VI.patch \
	"
