LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE_TAGS := optional

LOCAL_SRC_FILES := \
	$(call all-java-files-under, src) \
	$(call all-subdir-Java-files) \
	$(call all-renderscript-files-under, src)

LOCAL_PACKAGE_NAME := OtoWinRec

LOCAL_RESOURCE_DIR := $(LOCAL_PATH)/res 
LOCAL_ASSET_FILES += $(call find-subdir-assets)

LOCAL_CERTIFICATE := platform
LOCAL_SDK_VERSION := current

include $(BUILD_PACKAGE)

