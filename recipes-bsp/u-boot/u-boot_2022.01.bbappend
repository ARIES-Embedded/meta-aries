FILESEXTRAPATHS:prepend := "${THISDIR}/u-boot-2022.01:"

# MCVEVK
SRC_URI:append:mcvevk = " \
        file://0001-socfpga-mcvevk-clean-up-model-names-in-device-tree-f.patch \
        file://0002-mcvevk-add-env-commands-to-permit-booting-Linux-with.patch \
        file://0003-Revert-ARM-socfpga-Remove-socfpga_sdram_apply_static.patch \
        file://0004-configs-socfpga-enable-preboot-command-for-the-mcvev.patch \
        file://0005-usb-dwc2-handle-return-code-of-dev_read_size-in-of-t.patch \
        file://0006-ARM-socfpga-gen5-release-reset-before-using-USB-as-d.patch \
        "
