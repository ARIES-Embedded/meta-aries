FILESEXTRAPATHS_prepend := "${THISDIR}/config:${THISDIR}/linux-yocto-4.18:"

SRC_URI_append = " file://aries;type=kmeta;destsuffix=aries "
KERNEL_FEATURES_append_m28evk = " bsp/m28evk/m28evk.scc "
KERNEL_FEATURES_append_m53evk = " bsp/m53evk/m53evk.scc "
KERNEL_FEATURES_append_mcvevk = " bsp/mcvevk/mcvevk.scc "
KERNEL_FEATURES_append_ma5d4evk = " bsp/ma5d4evk/ma5d4evk.scc "

COMPATIBLE_MACHINE_m28evk = "m28evk"
COMPATIBLE_MACHINE_m53evk = "m53evk"
COMPATIBLE_MACHINE_mcvevk = "mcvevk"
COMPATIBLE_MACHINE_ma5d4evk = "ma5d4evk"

KBRANCH_mcvevk = "v4.18/standard/intel-socfpga"
SRCREV_machine_mcvevk = "d646afdd250db0b4bd461f27dd3a7f413eb12175"

KERNEL_VERSION_SANITY_SKIP="1"

SRC_URI_append_ma5d4evk = " \
	file://0001-drm-panel-Add-support-for-Ampire-AM-800480R2-800x480.patch \
	file://0002-ARM-at91-dt-sama5d4-Adjust-DTS-for-released-board-ve.patch \
	"
SRC_URI_append_m28evk = " \
	file://0003-mtd-rawnand-gpmi-fix-MX28-bus-master-lockup-problem.patch \
	"
