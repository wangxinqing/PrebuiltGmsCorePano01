package defpackage;

import com.google.android.chimera.Service;
import org.chromium.net.UrlRequest;

/* renamed from: apku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum apku implements auco {
    UNKNOWN_UNMET_PRECONDITION(0),
    TOO_YOUNG(1),
    LACKS_BIRTHDAY(2),
    IS_CHILD(3),
    IS_DASHER(4),
    NO_FAMILY(5),
    TOO_MANY_MEMBERS(6),
    TOO_MANY_PARENTS(7),
    NOT_ALLOWED(8),
    NO_PARENTAL_CONSENT(9),
    FAMILY_EXISTS(10),
    HOH_OF_ANOTHER_FAMILY(16),
    FAMILY_ACCESS_SECRET_NOT_FOUND(11),
    FAMILY_ACCESS_SECRET_EXPIRED(12),
    FAMILY_INACTIVE(13),
    TOO_MANY_FAMILY_SWITCHES(14),
    PLAY_COUNTRY_MISMATCH(17),
    CVN_CHALLENGE_REQUIRED(15),
    IS_MADISON(18),
    NOT_WHITELISTED(19),
    HOH_IP_COUNTRY_MISMATCH(20),
    IS_YOUNG_TEEN(21),
    IS_SUPERVISED_ACCOUNT(22),
    YOUNG_TEEN_PARENT_COUNTRY_MISMATCH(23),
    INVALID_GAIA_ID(24),
    TOO_OLD(25),
    IS_PARENT(26),
    TOS_COUNTRY_INELIGIBLE(27),
    EMAIL_ADDRESS_WITHOUT_GAIA_ID(28),
    INVALID_NOMINATION_TOKEN(29),
    TARGET_ACCOUNT_DELETED(30),
    IS_NOT_HOH(31),
    TOO_MANY_FAMILY_SWITCHES_CANDIDATE(32),
    MISSING_CONSENT_JOIN_FAMILY(33),
    HAS_MADISON_ACCOUNT(34),
    FAMILY_IS_BLOCKED(35),
    HOH_IS_BLOCKED(36),
    USER_IS_BLOCKED(37),
    IS_GRIFFIN(38),
    EXCEEDS_FAMILY_TOTAL_QUOTA(39),
    EXCEEDS_FAMILY_USER_QUOTA(40),
    HAS_ACTIVE_FAMILY_SUBSCRIPTION(41),
    HAS_PCID_SET_UP(42),
    HAS_FORMER_MEMBERS(43),
    CANT_SUPERVISE_SELF(44),
    FAMILY_EXISTS_UNCONFIRMED(45);
    
    public final int U;

    private apku(int i) {
        this.U = i;
    }

    public static apku a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_UNMET_PRECONDITION;
            case 1:
                return TOO_YOUNG;
            case 2:
                return LACKS_BIRTHDAY;
            case 3:
                return IS_CHILD;
            case 4:
                return IS_DASHER;
            case 5:
                return NO_FAMILY;
            case 6:
                return TOO_MANY_MEMBERS;
            case 7:
                return TOO_MANY_PARENTS;
            case 8:
                return NOT_ALLOWED;
            case 9:
                return NO_PARENTAL_CONSENT;
            case 10:
                return FAMILY_EXISTS;
            case 11:
                return FAMILY_ACCESS_SECRET_NOT_FOUND;
            case 12:
                return FAMILY_ACCESS_SECRET_EXPIRED;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return FAMILY_INACTIVE;
            case UrlRequest.Status.READING_RESPONSE /*14*/:
                return TOO_MANY_FAMILY_SWITCHES;
            case Service.START_CONTINUATION_MASK:
                return CVN_CHALLENGE_REQUIRED;
            case 16:
                return HOH_OF_ANOTHER_FAMILY;
            case 17:
                return PLAY_COUNTRY_MISMATCH;
            case 18:
                return IS_MADISON;
            case 19:
                return NOT_WHITELISTED;
            case 20:
                return HOH_IP_COUNTRY_MISMATCH;
            case 21:
                return IS_YOUNG_TEEN;
            case 22:
                return IS_SUPERVISED_ACCOUNT;
            case 23:
                return YOUNG_TEEN_PARENT_COUNTRY_MISMATCH;
            case 24:
                return INVALID_GAIA_ID;
            case 25:
                return TOO_OLD;
            case 26:
                return IS_PARENT;
            case 27:
                return TOS_COUNTRY_INELIGIBLE;
            case 28:
                return EMAIL_ADDRESS_WITHOUT_GAIA_ID;
            case 29:
                return INVALID_NOMINATION_TOKEN;
            case 30:
                return TARGET_ACCOUNT_DELETED;
            case 31:
                return IS_NOT_HOH;
            case 32:
                return TOO_MANY_FAMILY_SWITCHES_CANDIDATE;
            case 33:
                return MISSING_CONSENT_JOIN_FAMILY;
            case 34:
                return HAS_MADISON_ACCOUNT;
            case 35:
                return FAMILY_IS_BLOCKED;
            case 36:
                return HOH_IS_BLOCKED;
            case 37:
                return USER_IS_BLOCKED;
            case 38:
                return IS_GRIFFIN;
            case 39:
                return EXCEEDS_FAMILY_TOTAL_QUOTA;
            case 40:
                return EXCEEDS_FAMILY_USER_QUOTA;
            case 41:
                return HAS_ACTIVE_FAMILY_SUBSCRIPTION;
            case 42:
                return HAS_PCID_SET_UP;
            case 43:
                return HAS_FORMER_MEMBERS;
            case 44:
                return CANT_SUPERVISE_SELF;
            case 45:
                return FAMILY_EXISTS_UNCONFIRMED;
            default:
                return null;
        }
    }

    public static aucq b() {
        return apkt.a;
    }

    public final int a() {
        return this.U;
    }

    public final String toString() {
        return Integer.toString(this.U);
    }
}
