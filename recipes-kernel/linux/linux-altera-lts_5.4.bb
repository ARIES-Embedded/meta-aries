LINUX_VERSION = "5.4.64"
LINUX_VERSION_SUFFIX = "-lts"

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

SRCREV = "1f2f1ded05f1c6a1349fd0ffb20042679cd50d5e"

include linux-altera.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/config::${THISDIR}/linux-altera-lts-5.4:"

SRC_URI_append_mcvevk = " \
	file://lbdaf.scc \
	file://0001-socfpga-mcvevk-clean-up-model-names-in-device-tree-f.patch \
	file://0002-socfpga-mcvevk-framebuffer-support-for-the-Altera-VI.patch \
	"
