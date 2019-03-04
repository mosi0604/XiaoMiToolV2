package com.xiaomitool.v2.language;

import com.xiaomitool.v2.logging.Log;
import com.xiaomitool.v2.procedure.install.InstallException;
import com.xiaomitool.v2.xiaomi.miuithings.Branch;

public enum  LRes  {
    TIP_WINDOW_CLOSE("Close"),
    TIP_WINDOW_MINIMIZE("Minimize"),
    TIP_WINDOW_SETTINGS("Settings"),
    LOGIN_WHY_LOGIN("Why login?"),
    LOGIN_WHY_LOGIN_TEXT("Log in is used by this tool for some advanced features. More specifically it is used to enable bootloader unlock feature (to verify the device-user binding and to request the unlock token to Xiaomi servers) and to install rom via recovery depending on account access level (with a beta authorized account you can install beta roms via recovery, which are not installable by default)."),
    OK_UNDERSTAND("Ok, I understand"),
    AGREE("Agree"),
    DONT_AGREE("Don't agree"),
    DISCLAIMER("Disclaimer"),
    SETTINGS_DOWNLOAD_DIR("Download directory"),
    SETTINGS_EXTRACT_DIR("Extraction directory"),
    SETTINGS_SAVE_SESSION("Save user login session"),
    SETTINGS_CLEAR("Wipe download and extract directories"),
    CHOOSE("Choose"),
    TRANSLATED_BY("Translated by"),
    CHOOSE_RECOVER_DEVICE("My device is bricked\nI want to unbrick it."),
    CHOOSE_MOD_DEVICE("My device works normally\nI want to mod it."),
    SEARCHING_CONNECTED_DEVICES("Searching connected devices"),
    LOADING("Loading"),
    HT_ENABLE_USB_DEBUG("How to enable usb debugging?"),
    SEARCH_AGAIN("Search again"),
    NO_DEVICE_CONNECTED("No devices with usb debugging enabled found.\nPlease enable usb debugging and try again."),
    FEATURE_NOT_AVAILABLE("Feature not available yet."),
    UNKNOWN("Unknown"),
    SERIAL("Serial"),
    STATUS("Status"),
    CODENAME("Codename"),
    BRAND("Brand"),
    MODEL("Model"),
    SELECT("Select"),
    SELECTED_DEVICE("Selected device: %s"),
    TRY_AGAIN("Try again"),
    DEVICE_NOT_CONNECTED("It seems your device is not connected. Please make sure your device is on, connected to your pc and with usb debugging enabled"),
    AUTH_DEVICE_TEXT("Your device is offline or not authorized. Please authorize your device by clicking on the popup window that is displayed on its screen."),
    YES("Yes"),
    NO("No"),
    IRRELEVANT("Irrilevant"),
    UNLOCKED("Unlocked"),
    LOCKED("Locked"),
    MIUI_VERSION("MIUI version"),
    ANDROID_VERSION("Android version"),
    SERIAL_NUMBER("Serial number"),
    BOOTLOADER_STATUS("Bootloader status"),
    FASTBOOT_PARSED("Complete fastboot information"),
    RECOVERY_PARSED("Complete recovery information"),
    FINDING_INFO_TEXT("Collecting information from your device to establish what procedure can be applied.\nPlease wait for this operation to finish or messages from this tool.\nThe device will reboot a few times during this operation."),
    RECOVERY_RECOVER_TMP("You are about to use an exclusive feature of this tool that should be used only in one of these scenarios:\n-Your device doesn't boot and goes to recovery menu with this message: \"This MIUI version can't be installed on this device\" or\n-Your device has locked bootloader and when you get to the region selection screen during first device configuration you can select only \"China\" and by pressing that your device reboots and goes into bootloop.\nYou should not use this feature if your device has not one of these problems, because it is a risky operation that could brick your device by leading to such problems or worse.\nThis feature is not official and depends on Xiaomi servers and Xiaomi recovery and thus could be disabled by Xiaomi in the future. Please make sure you are connected to Internet.\nThis procedure will wipe the device data."),
    NO_DEVICE_CONNECTED_RECOVERY("No devices in recovery mode found.\nPlease put your device in recovery mode and try again."),
    NO_DEVICE_CONNECTED_FASTBOOT("No devices in fastboot mode found.\nPlease put your device in fastboot mode and try again."),
    HT_GO_RECOVERY("How to enter recovery mode?"),
    HT_GO_FASTBOOT("How to enter fastboot mode?"),
    BTN_VOLUP_POW("Hold the volume+ and power buttons until your device reboots to recovery menu screen"),
    BTN_VOLDOWN_POW("Hold the volume- and power buttons until your device reboots to fastboot mode screen"),
    HT_RECOVERY_TEXT_1("Use the volume buttons to move to the third option (\"Connect with MIAssistant\" o \"连接小米助手\") and then use the power button to select it"),
    SEARCHING_CONNECTED_MTP_DEVICES("Searching connected MTP devices"),
    MTP_SENDING_FILE("Sending rom file to the device using MTP protocol"),
    STARTING_TASK("Starting task"),
    SECONDS("seconds"),
    MINUTES("minutes"),
    HOURS("hours"),
    PROGRESS_TEXT("Running... [%7s/%7s %s] - %3d%% - %8s - %2d %s remaining"),
    TASK_FINISHED("Task finished"),
    MTP_PREPARE_INSTALL("Preparing MTP installation"),
    MTP_ENABLING_DEVICE("Enabling MTP feature on the device"),
    MTP_DEVICE_SELECTED("MTP device detected"),
    FILE_SENT_TO_DEVICE("File sent to the device"),
    MTP_INSTALLING_FILE("Installing rom file on the device using MTP installation"),
    SIDELOAD_INSTALLING_FILE("Installing rom file on the device using sideload installation"),
    ROM_INSTALLED_ON_DEVICE("Rom installed on the device"),
    PARTITION_FORMATTING("Formatting %s partition"),
    PARTITION_FORMATTED("Partition formatted"),
    FETCHING_RECOVERY_INFO("Retrieving recovery information"),
    DONATE("Make a donation"),
    DONATE_DONT("Don't give a ****"),
    DONATE_TEXT("This tool has been developed thanks to the users donations.\nThe developer of this tool isn't paid for his work and he is paying for services with his pocket money, leaving this tool free.\nIf you want to show your gratitude to him or support this project you can still offer him a beer by making a donation.\n\nWould you like to make a donation?"),
    INSTALL_SUCCESS("Installation completed succesfully!"),
    DOWNLOADING_ROM_FILE("Downloading rom file..."),
    EXIT_TOOL("Close the tool"),
    DONATE_THANKS_TEXT("You can procced by making the donation using the methods indicated on the website. Thank you, I hope I've been helpful with this tool :)"),
    REBOOTING_TO_MODE("Rebooting the device to %s mode"),
    DONT_REBOOT_DEVICE("Don't reboot the device and don't disconnect it from the pc"),
    SEARCHING_LATEST_ROM("Searching latest rom %s"),
    QUERYING_OTA_ROM("Searching rom update to %s"),
    GLOBAL_STABLE("Global stable"),
    GLOBAL_DEVELOPER("Global developer"),
    CHINA_STABLE("Chinese stable"),
    CHINA_DEVELOPER("Chinese developer"),
    ROM_SELECTED_ROM("Rom selected: %s"),
    INET_CHECKING_CONNECTION("Checking internet connection"),
    INET_CONNECTION_ERROR_TEXT("Internet connection failed.\nInternet connection is required for the proper use of this tool.\n\nPlease connect your pc to Internet and try again"),
    INET_CONNECTION_ERROR_TITLE("Online services connection error"),
    UPDATE_WILL_UPDATE("Download the update"),
    UPDATE_AVAILABLE_TEXT("An update for this tool is available.\nIt is recommended to update always to the latest version of the tool because older version may contain more bugs or outdated procedures that could harm your device.\n\nDo you want to download the latest update?"),
    IGNORE("Ignore"),
    LOGIN_CANCELED("Login canceled or failed"),
    LOGIN_SUCCESS("Logged in succesfully"),
    PROCEDURE_EXC_TITLE("Procedure error occurred"),
    PROCEDURE_EXC_TEXT("There was an error during the installation producedure.\nYou can choose between trying again starting from the failed step, or step back to a previous step and trying again the procedure, or cancel the operation and abort the installation process."),
    PROCEDURE_EXC_DETAILS("Error details:\nError code: %s"),
    PROCEDURE_EXC_ADV_DETAILS("Advanced error details"),
    CANCEL("Cancel"),
    STEP_BACK("Step back"),
    DRIVER_FIXING_MTP("Fixing MTP driver issues"),
    DRIVER_INSTALLING("Installing driver %s"),
    FETCHING_DOWNLOAD_URL("Fetching download url"),
    TWRP_SEARCHING_FROM("Searching TWRP for device %s from %s"),
    FILE_PLEASE_SELECT("Please select %s file"),
    FILE_SELECT_DRAGDROP("Press here to select a file or drag and drop it"),
    FILE_SELECTED("File selected"),
    TWRP_SELECT_FILE("Please select the TWRP file"),
    TWRP_SELECT_FILE_EXP("Failed to obtain the twrp file for your device automatically. You have to find it and download it by yourself. Usually you just need to search \"twrp %s\" on google and in the first results you will find that. Once downloaded press the box below to select it and then continue."),
    CONTINUE("Continue"),
    FILE_PLEASE_SELECT_POPUP("Please select a file and then press continue"),
    CHOOSE_XIAOMI_TITLE("Official Xiaomi rom"),
    CHOOSE_XIAOMI_SUB("Official firmware coming directly from the OEM"),
    CHOOSE_UNLOCK_TITLE("Unlock, lock bootloader and other"),
    CHOOSE_UNLOCK_SUB("Select this if you want to do bootloader operations"),
    CHOOSE_CUSTOM_TITLE("Custom rom, not official"),
    CHOOSE_CUSTOM_SUB("Any custom, not official rom, for example xiaomi.eu, lineageos, ..."),
    CHOOSE_MOD_TITLE("Mods, root and twrp"),
    CHOOSE_MOD_SUB("Any flashable mod, for example magisk, twrp, xposed, ..."),
    ROM_GLOBAL_STABLE("Global stable"),
    ROM_CHINA_STABLE("China stable"),
    ROM_CHINA_DEVELOPER("China developer"),
    ROM_GLOBAL_DEVELOPER("Global developer"),
    ROM_LOCAL_OFFICIAL_SUB("Choose an official rom to install from your PC"),
    ROM_LOCAL_OFFICIAL("Local official rom file"),
    ROM_LOCAL("Local rom file"),
    ROM_LOCAL_SUB("Choose the rom file to install from your PC"),
    FILE_SELECT_OFFICIAL_TIT("Please select official rom file"),
    FILE_SELECT_OFFICIAL_TEXT("Press the box below to select the file of the official miui rom that you want to install"),
    UNIMPORTANT("Unimportant"),
    UNLOCK_BOOTLOADER("Unlock bootloader"),
    UNLOCK_DEVICE_BOOTLOADER("Unlock the bootloader of this device"),
    UNLOCK_BOOTLOADER_WARN("You're about to unlock your device.\nThis tool will request the unlock token from Xiaomi server.\nIf your account is Xiaomi binded to the device for enough time the server will eventually give the unlock token and this tool will proceed with the unlock procedure.\n\nUnlocking might erase your device data, so if you need to backup some data please cancel this procedure and do a backup before trying again."),
    TWRP_RECOVERY("Twrp recovery"),
    TWRP_SELECT_MANUAL("Select a twrp reccovry file to install"),
    TWRP_AUTO_DOWNLOAD("Download and install twrp automatically"),
    MAGISK_ROOT("Root with magisk"),
    MAGISK_AUTO_DOWNLOAD("Download and install magisk %s"),
    XIAOMIEU_TITLE("Xiaomi.eu rom"),
    XIAOMIEU_AUTO_DOWNLOAD("Download and install Xiaomi.eu rom"),
    FILE_SELECT_TIT("Please select rom file"),
    FILE_SELECT_TEXT("Press the box below to select the file of the rom that you want to install"),
    ROM_LOCAL_TEXT("Install a rom that you already downloaded on your pc. Both miui and non-miui roms accepted"),
    MOD_LOCAL("Local mod file"),
    MOD_LOCAL_TEXT("Install a twrp flashable zip mod already present on your pc"),
    BRANCH_STABLE("Stable"),
    BRANCH_DEVELOPER("Developer"),
    BRANCH_ALPHA("Alpha"),
    ADB_PUSHING_FILE("Pushing file to the device via ADB"),
    INSTALL_TWRP_ZIP("Starting TWRP installation process"),
    ABORT("Abort"),
    REBOOT_RECOVERY_FAILED("Your device should enter recovery mode, but it seems it failed to do that or is not recognized or not connected.\nPlease hold the volume+ and power button to reboot it to recovery mode.\n\nFail cause: %s"),
    REBOOT_BOOTLOADER_FAILED("Your device should enter fastboot mode, but it seems it failed to do that or is not recognized or not connected.\nPlease hold the volume- and power button to reboot it to fastboot mode.\n\nFail cause: %s"),
    REBOOT_STOCKRECOVERY_FAILED("Your device should enter stock recovery mode, but it seems it failed to do that or is not recognized or not connected.\nPlease hold the volume+ and power button to reboot it to stock recovery mode.\n\nFail cause: %s"),
    FLASHING_STUFF("Flashing %s..."),
    BOOTING_STUFF("Booting %s..."),
    CREATING_DEST_DIR("Creating destination directory"),
    WAITING_DEVICE_ACTIVE("Waiting device active status"),
    SEARCHING_LATEST_FASTBOOT("Searching latest fastboot rom: %s"),
    CALCULATING_MD5("Calculating md5 hash of file"),
    SEARCHING_XIAOMIEU_ROM("Searching latest Xiaomi.eu rom: %s"),
    SEARCHING_LATEST_MAGISK("Searching latest magisk zip file"),
    VALIDATING_PKG_ROM("Trying to validate rom package with miui server"),
    OTA_REQUEST_RUN("Running ota request to miui server"),
    SEARCHING_LATEST_RECOVERY_ROM("Searching latest recovery rom: %s"),
    BACK_TO_CATEGORIES("Back to categories"),
    BACK_TO_CATEGORIES_TEXT("Go back and choose another category of installables"),
    STARTING_MIUI_SIDELOAD("Starting MIUI sideload procedure"),
    REQ_CHECK_STOCKRECOVERY("Check if stock recovery is available"),
    REQ_BOOTLOADER_UNLOCKED("Unlock the bootloader"),
    REQ_BOOTLOADER_UNLOCKED_MIUI("Unlock the bootloader (might require days of waiting time)"),
    REQ_INSTALL_TWRP("Install twrp"),
    CONFIRM_REQUIREMENTS_TEXT("This installation requires some additional steps before the actual procedure can start.\nThis tool will take care of these steps if you confirm the procedure\nPress %s if you want to continue, %s to go back to rom selection.\nHere is what is necessary to do:\n\n"),
    REQ_CHECK_TWRPINSTALL("Check if twrp recovery is installed"),
    IF_NOT_INSTALLED("If not installed"),
    ENABLE_USB_DEBUG_IF_NOT("Enable usb debugging (if not enabled)"),
    EXTRACTING_ROM_FILE("Extracting rom file..."),
    CHOOSE_PROCEDURE_CATEGORY("Please choose procedure category"),
    CHOOSE_PROCEDURE("Please choose which rom/procedure you want")
    ;
    private String text;

    LRes(String defaultText){
        this.text = defaultText;
    }

    public String getKey() {
        return this.name().toLowerCase();
    }

    public String toString(){
        //TODO remove only english
        if (true) {
            return text;
        }
        try {
            return Lang.text(getKey());
        } catch (Exception e) {
            return this.text;
        }
    }
    public String toString(Object... args){
        //TODO remove only english
        if (true) {
            return String.format(this.text, args);
        }
        try {
            return Lang.text(getKey(),args);
        } catch (Exception e) {
            Log.debug(e);
            Log.debug(e.getMessage());
            StringBuilder builder = new StringBuilder(e.getMessage());
            for (Object o : args){
                builder.append(',').append(o == null ? "null" : o.toString());
            }
            return builder.toString();
        }

    }

    public static String branchToString(Branch branch){
        if (branch == null){
            return "null branch";
        }
        switch (branch){
            case STABLE:
                return LRes.BRANCH_STABLE.toString();
            case DEVELOPER:
            case DEBUG:
                return LRes.BRANCH_DEVELOPER.toString();
            default:
                return LRes.BRANCH_ALPHA.toString();
        }
    }


}