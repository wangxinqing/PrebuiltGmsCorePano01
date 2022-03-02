package defpackage;

import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: aqrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aqrk implements auco {
    ICON_UNSPECIFIED(0),
    PRIVACY_CHECKUP_GOOD_ICON(1),
    PRIVACY_CHECKUP_NEUTRAL_ICON(2),
    SECURITY_CHECKUP_GOOD_ICON(4),
    SECURITY_CHECKUP_NEUTRAL_ICON(5),
    SECURITY_CHECKUP_WARNING_ICON(6),
    CHEVRON_LEFT_ICON(17),
    CHEVRON_RIGHT_ICON(10),
    CHEVRON_FORWARD_ICON(21),
    EDIT_ICON(11),
    OPEN_IN_NEW_ICON(20),
    PHONE_ANDROID_ICON(26),
    IMAGE_PLACEHOLDER_ICON(12),
    ACCOUNT_ICON(13),
    SEARCH_ICON(14),
    SUPPORT_ICON(15),
    MENU_ICON(16),
    ACCOUNT_ICON_SELECTED(22),
    SEARCH_ICON_SELECTED(23),
    SUPPORT_ICON_SELECTED(24),
    MENU_ICON_SELECTED(25),
    PERSONAL_INFO_ICON(34),
    TOGGLE_ON_ICON(35),
    PAYMENT_ICON(27),
    PEOPLE_OUTLINE_ICON(36),
    LOCK_ICON(28),
    CLOUD_OFF_ICON(18),
    GENERIC_ERROR_ICON(19),
    GOOGLE_G_COLORED_ICON(29),
    PERM_DEVICE_INFO_ICON(30),
    LOCAL_HOSPITAL_ICON(31),
    GROUP_ICON(32),
    GOOGLE_G_ICON(33);
    
    public final int H;

    private aqrk(int i) {
        this.H = i;
    }

    public static aqrk a(int i) {
        if (i == 0) {
            return ICON_UNSPECIFIED;
        }
        if (i == 1) {
            return PRIVACY_CHECKUP_GOOD_ICON;
        }
        if (i == 2) {
            return PRIVACY_CHECKUP_NEUTRAL_ICON;
        }
        if (i == 4) {
            return SECURITY_CHECKUP_GOOD_ICON;
        }
        if (i == 5) {
            return SECURITY_CHECKUP_NEUTRAL_ICON;
        }
        if (i == 6) {
            return SECURITY_CHECKUP_WARNING_ICON;
        }
        switch (i) {
            case 10:
                return CHEVRON_RIGHT_ICON;
            case 11:
                return EDIT_ICON;
            case 12:
                return IMAGE_PLACEHOLDER_ICON;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return ACCOUNT_ICON;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return SEARCH_ICON;
            case Service.START_CONTINUATION_MASK:
                return SUPPORT_ICON;
            case 16:
                return MENU_ICON;
            case 17:
                return CHEVRON_LEFT_ICON;
            case 18:
                return CLOUD_OFF_ICON;
            case 19:
                return GENERIC_ERROR_ICON;
            case 20:
                return OPEN_IN_NEW_ICON;
            case 21:
                return CHEVRON_FORWARD_ICON;
            case 22:
                return ACCOUNT_ICON_SELECTED;
            case 23:
                return SEARCH_ICON_SELECTED;
            case 24:
                return SUPPORT_ICON_SELECTED;
            case 25:
                return MENU_ICON_SELECTED;
            case 26:
                return PHONE_ANDROID_ICON;
            case 27:
                return PAYMENT_ICON;
            case 28:
                return LOCK_ICON;
            case 29:
                return GOOGLE_G_COLORED_ICON;
            case 30:
                return PERM_DEVICE_INFO_ICON;
            case 31:
                return LOCAL_HOSPITAL_ICON;
            case 32:
                return GROUP_ICON;
            case 33:
                return GOOGLE_G_ICON;
            case 34:
                return PERSONAL_INFO_ICON;
            case 35:
                return TOGGLE_ON_ICON;
            case 36:
                return PEOPLE_OUTLINE_ICON;
            default:
                return null;
        }
    }

    public final int a() {
        return this.H;
    }

    public final String toString() {
        return Integer.toString(this.H);
    }
}
