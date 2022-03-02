package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: qbk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum qbk implements auco {
    DEFAULT_OPERATION_NAME(0),
    SIGNIN_AUTH_ACCOUNT(1),
    SIGNIN_GET_CURRENT_ACCOUNT(2),
    SIGNIN_RECORD_CONSENT(3),
    SIGNIN_RESOLVE_ACCOUNT(4),
    SIGNIN_SAVE_DEFAULT_ACCOUNT(5),
    SIGNIN_SIGNIN_MODULE_INIT_INTENT(6),
    SIGNIN_SIGNIN(7),
    SIGNIN_RECORD_CONSENT_BY_CONSENT_RESULT(8),
    AUTH_API_SIGNIN_SIGNIN(101),
    AUTH_API_SIGNIN_SILENT_SIGNIN(102),
    AUTH_API_SIGNIN_SIGN_OUT(103),
    AUTH_API_SIGNIN_REVOKE_ACCESS(104),
    AUTH_API_CREDENTIALS_LIST_CREDENTIALS(201),
    AUTH_API_CREDENTIALS_LIST_ENABLED_ACCOUNTS(202),
    AUTH_API_CREDENTIALS_REQUEST_ID_TOKEN(203),
    AUTH_API_CREDENTIALS_SET_IS_FIRST_TIME_WELCOME_SHOWN(204),
    AUTH_API_CREDENTIALS_SAVE(205),
    AUTH_API_CREDENTIALS_REQUEST(206),
    AUTH_API_CREDENTIALS_DISABLE_AUTO_SIGNIN(207),
    AUTH_API_CREDENTIALS_DELETE(208),
    AUTH_API_CREDENTIALS_BEGIN_SIGNIN(209),
    AUTH_API_CREDENTIALS_LIST_HINTS(210),
    AUTH_API_CREDENTIALS_LIST_SIGNIN_CREDENTIALS(211),
    AUTH_API_CREDENTIALS_INTERNAL_DISABLE_YOLO_SAVE_DIALOG_FOR_APP(212),
    AUTH_API_CREDENTIALS_INTERNAL_SET_APP_NEVER_SAVE(213),
    AUTH_API_CREDENTIALS_INTERNAL_SET_AUTO_SIGNIN_ENABLED_FOR_APP(214),
    AUTH_API_CREDENTIALS_INTERNAL_SET_AUTO_SIGNIN_ENABLED(215),
    AUTH_API_CREDENTIALS_INTERNAL_SET_SERVICE_ENABLED(216),
    AUTH_API_CREDENTIALS_INTERNAL_GET_ACCOUNT_SETTINGS(217),
    AUTH_API_CREDENTIALS_INTERNAL_SAVE_CREDENTIAL(218),
    AUTH_API_CREDENTIALS_INTERNAL_GET_FULL_CREDENTIAL(219),
    AUTH_API_CREDENTIALS_INTERNAL_LIST_GOOGLE_ACCOUNTS(220),
    AUTH_API_CREDENTIALS_INTERNAL_LIST_GOOGLE_ID_TOKEN_SIGN_IN_CREDENTIALS(221),
    AUTH_API_CREDENTIALS_INTERNAL_LIST_CREDENTIALS_FOR_ENABLED_ACCOUNTS(222),
    AUTH_API_CREDENTIALS_INTERNAL_LIST_PASSWORD_SIGN_IN_CREDENTIALS(223),
    AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_IS_SERVICE_ENABLED(224),
    AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_SET_SERVICE_ENABLED(225),
    AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_IS_FIRST_TIME_WELCOME_NEEDED(226),
    AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_SET_FIRST_TIME_WELCOME_NEEDED(227),
    AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_IS_AUTO_SIGNIN_ENABLED(228),
    AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_SET_AUTO_SIGNIN_ENABLED(229),
    AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_IS_CUSTOM_PASSPHRASE_IN_USE(230),
    AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_IS_NEVER_SAVE_APP(231),
    AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_SET_NEVER_SAVE_APP(232),
    AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_GET_ALL_SETTINGS(233),
    AUTH_API_CREDENTIALS_APP_SETTINGS_IS_AUTO_SIGNIN_ENABLED_FOR_APP(234),
    AUTH_API_CREDENTIALS_APP_SETTINGS_SET_AUTO_SIGNIN_ENABLED_FOR_APP(235),
    AUTH_API_CREDENTIALS_CREDENTIAL_LIST_CREDENTIALS(236),
    AUTH_API_CREDENTIALS_CREDENTIAL_GET_FULL_CREDENTIAL(237),
    AUTH_API_CREDENTIALS_CREDENTIAL_REMOVE(238),
    AUTH_API_CREDENTIALS_CREDENTIAL_SAVE(239),
    AUTH_API_CREDENTIALS_HINTS_LIST_HINTS(240),
    AUTH_API_CREDENTIALS_APP_SETTINGS_DATA_PROVIDER_IS_AUTO_SIGNIN_ENABLED_FOR_APP(241),
    AUTH_API_CREDENTIALS_APP_SETTINGS_DATA_PROVIDER_SET_AUTO_SIGNIN_ENABLED_FOR_APP(242),
    AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_LIST_CREDENTIALS(243),
    AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_GET_FULL_CREDENTIAL(244),
    AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_REMOVE(245),
    AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_SAVE(246),
    AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_HINTS_LIST_HINTS(247),
    AUTH_API_CREDENTIALS_INTERNAL_COMPLETE_SIGN_IN(248),
    AUTH_API_CREDENTIALS_SIGN_OUT(250),
    AUTH_API_CREDENTIALS_INTERNAL_RECORD_CANCELLED_SIGN_IN(251),
    AUTH_API_CREDENTIALS_INTERNAL_RESET_SIGN_IN_CANCELLATION_COUNTER(252),
    AUTH_API_CREDENTIALS_INTERNAL_RECORD_GRANTS(253),
    AUTH_API_CREDENTIALS_INTERNAL_UPDATE_DEFAULT_ACCOUNT(254),
    AUTH_API_CREDENTIALS_INTERNAL_FETCH_PROFILE_DATA(255),
    AUTH_API_CREDENTIALS_INTERNAL_LIST_ELIGIBLE_ACCOUNTS_FOR_PASSWORD_SAVE(PSKKeyManager.MAX_KEY_LENGTH_BYTES),
    AUTH_API_CREDENTIALS_SAVE_SIGNIN_PASSWORD(257),
    AUTH_API_CREDENTIALS_INTERNAL_MATCH_PASSWORD(258),
    AUTH_API_CREDENTIALS_INTERNAL_SAVE_PASSWORD(259),
    AUTH_API_CREDENTIALS_INTERNAL_GET_DEFAULT_ACCOUNT(260),
    AUTH_API_CREDENTIALS_AUTHORIZE(261),
    AUTH_API_CREDENTIALS_GET_SIGN_IN_INTENT(262),
    AUTH_API_CREDENTIALS_SAVE_ACCOUNT_LINKING_TOKEN(263),
    AUTH_API_CREDENTIALS_INTERNAL_COMPLETE_SAVE_ACCOUNT_LINKING_TOKEN(264);
    
    public final int ay;

    private qbk(int i) {
        this.ay = i;
    }

    public static qbk a(int i) {
        switch (i) {
            case 0:
                return DEFAULT_OPERATION_NAME;
            case 1:
                return SIGNIN_AUTH_ACCOUNT;
            case 2:
                return SIGNIN_GET_CURRENT_ACCOUNT;
            case 3:
                return SIGNIN_RECORD_CONSENT;
            case 4:
                return SIGNIN_RESOLVE_ACCOUNT;
            case 5:
                return SIGNIN_SAVE_DEFAULT_ACCOUNT;
            case 6:
                return SIGNIN_SIGNIN_MODULE_INIT_INTENT;
            case 7:
                return SIGNIN_SIGNIN;
            case 8:
                return SIGNIN_RECORD_CONSENT_BY_CONSENT_RESULT;
            default:
                switch (i) {
                    case 101:
                        return AUTH_API_SIGNIN_SIGNIN;
                    case 102:
                        return AUTH_API_SIGNIN_SILENT_SIGNIN;
                    case 103:
                        return AUTH_API_SIGNIN_SIGN_OUT;
                    case 104:
                        return AUTH_API_SIGNIN_REVOKE_ACCESS;
                    default:
                        switch (i) {
                            case 201:
                                return AUTH_API_CREDENTIALS_LIST_CREDENTIALS;
                            case 202:
                                return AUTH_API_CREDENTIALS_LIST_ENABLED_ACCOUNTS;
                            case 203:
                                return AUTH_API_CREDENTIALS_REQUEST_ID_TOKEN;
                            case 204:
                                return AUTH_API_CREDENTIALS_SET_IS_FIRST_TIME_WELCOME_SHOWN;
                            case 205:
                                return AUTH_API_CREDENTIALS_SAVE;
                            case 206:
                                return AUTH_API_CREDENTIALS_REQUEST;
                            case 207:
                                return AUTH_API_CREDENTIALS_DISABLE_AUTO_SIGNIN;
                            case 208:
                                return AUTH_API_CREDENTIALS_DELETE;
                            case 209:
                                return AUTH_API_CREDENTIALS_BEGIN_SIGNIN;
                            case 210:
                                return AUTH_API_CREDENTIALS_LIST_HINTS;
                            case 211:
                                return AUTH_API_CREDENTIALS_LIST_SIGNIN_CREDENTIALS;
                            case 212:
                                return AUTH_API_CREDENTIALS_INTERNAL_DISABLE_YOLO_SAVE_DIALOG_FOR_APP;
                            case 213:
                                return AUTH_API_CREDENTIALS_INTERNAL_SET_APP_NEVER_SAVE;
                            case 214:
                                return AUTH_API_CREDENTIALS_INTERNAL_SET_AUTO_SIGNIN_ENABLED_FOR_APP;
                            case 215:
                                return AUTH_API_CREDENTIALS_INTERNAL_SET_AUTO_SIGNIN_ENABLED;
                            case 216:
                                return AUTH_API_CREDENTIALS_INTERNAL_SET_SERVICE_ENABLED;
                            case 217:
                                return AUTH_API_CREDENTIALS_INTERNAL_GET_ACCOUNT_SETTINGS;
                            case 218:
                                return AUTH_API_CREDENTIALS_INTERNAL_SAVE_CREDENTIAL;
                            case 219:
                                return AUTH_API_CREDENTIALS_INTERNAL_GET_FULL_CREDENTIAL;
                            case 220:
                                return AUTH_API_CREDENTIALS_INTERNAL_LIST_GOOGLE_ACCOUNTS;
                            case 221:
                                return AUTH_API_CREDENTIALS_INTERNAL_LIST_GOOGLE_ID_TOKEN_SIGN_IN_CREDENTIALS;
                            case 222:
                                return AUTH_API_CREDENTIALS_INTERNAL_LIST_CREDENTIALS_FOR_ENABLED_ACCOUNTS;
                            case 223:
                                return AUTH_API_CREDENTIALS_INTERNAL_LIST_PASSWORD_SIGN_IN_CREDENTIALS;
                            case 224:
                                return AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_IS_SERVICE_ENABLED;
                            case 225:
                                return AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_SET_SERVICE_ENABLED;
                            case 226:
                                return AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_IS_FIRST_TIME_WELCOME_NEEDED;
                            case 227:
                                return AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_SET_FIRST_TIME_WELCOME_NEEDED;
                            case 228:
                                return AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_IS_AUTO_SIGNIN_ENABLED;
                            case 229:
                                return AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_SET_AUTO_SIGNIN_ENABLED;
                            case 230:
                                return AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_IS_CUSTOM_PASSPHRASE_IN_USE;
                            case 231:
                                return AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_IS_NEVER_SAVE_APP;
                            case 232:
                                return AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_SET_NEVER_SAVE_APP;
                            case 233:
                                return AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_GET_ALL_SETTINGS;
                            case 234:
                                return AUTH_API_CREDENTIALS_APP_SETTINGS_IS_AUTO_SIGNIN_ENABLED_FOR_APP;
                            case 235:
                                return AUTH_API_CREDENTIALS_APP_SETTINGS_SET_AUTO_SIGNIN_ENABLED_FOR_APP;
                            case 236:
                                return AUTH_API_CREDENTIALS_CREDENTIAL_LIST_CREDENTIALS;
                            case 237:
                                return AUTH_API_CREDENTIALS_CREDENTIAL_GET_FULL_CREDENTIAL;
                            case 238:
                                return AUTH_API_CREDENTIALS_CREDENTIAL_REMOVE;
                            case 239:
                                return AUTH_API_CREDENTIALS_CREDENTIAL_SAVE;
                            case 240:
                                return AUTH_API_CREDENTIALS_HINTS_LIST_HINTS;
                            case 241:
                                return AUTH_API_CREDENTIALS_APP_SETTINGS_DATA_PROVIDER_IS_AUTO_SIGNIN_ENABLED_FOR_APP;
                            case 242:
                                return AUTH_API_CREDENTIALS_APP_SETTINGS_DATA_PROVIDER_SET_AUTO_SIGNIN_ENABLED_FOR_APP;
                            case 243:
                                return AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_LIST_CREDENTIALS;
                            case 244:
                                return AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_GET_FULL_CREDENTIAL;
                            case 245:
                                return AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_REMOVE;
                            case 246:
                                return AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_SAVE;
                            case 247:
                                return AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_HINTS_LIST_HINTS;
                            case 248:
                                return AUTH_API_CREDENTIALS_INTERNAL_COMPLETE_SIGN_IN;
                            default:
                                switch (i) {
                                    case 250:
                                        return AUTH_API_CREDENTIALS_SIGN_OUT;
                                    case 251:
                                        return AUTH_API_CREDENTIALS_INTERNAL_RECORD_CANCELLED_SIGN_IN;
                                    case 252:
                                        return AUTH_API_CREDENTIALS_INTERNAL_RESET_SIGN_IN_CANCELLATION_COUNTER;
                                    case 253:
                                        return AUTH_API_CREDENTIALS_INTERNAL_RECORD_GRANTS;
                                    case 254:
                                        return AUTH_API_CREDENTIALS_INTERNAL_UPDATE_DEFAULT_ACCOUNT;
                                    case 255:
                                        return AUTH_API_CREDENTIALS_INTERNAL_FETCH_PROFILE_DATA;
                                    case PSKKeyManager.MAX_KEY_LENGTH_BYTES:
                                        return AUTH_API_CREDENTIALS_INTERNAL_LIST_ELIGIBLE_ACCOUNTS_FOR_PASSWORD_SAVE;
                                    case 257:
                                        return AUTH_API_CREDENTIALS_SAVE_SIGNIN_PASSWORD;
                                    case 258:
                                        return AUTH_API_CREDENTIALS_INTERNAL_MATCH_PASSWORD;
                                    case 259:
                                        return AUTH_API_CREDENTIALS_INTERNAL_SAVE_PASSWORD;
                                    case 260:
                                        return AUTH_API_CREDENTIALS_INTERNAL_GET_DEFAULT_ACCOUNT;
                                    case 261:
                                        return AUTH_API_CREDENTIALS_AUTHORIZE;
                                    case 262:
                                        return AUTH_API_CREDENTIALS_GET_SIGN_IN_INTENT;
                                    case 263:
                                        return AUTH_API_CREDENTIALS_SAVE_ACCOUNT_LINKING_TOKEN;
                                    case 264:
                                        return AUTH_API_CREDENTIALS_INTERNAL_COMPLETE_SAVE_ACCOUNT_LINKING_TOKEN;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static aucq b() {
        return qbj.a;
    }

    public final int a() {
        return this.ay;
    }

    public final String toString() {
        return Integer.toString(this.ay);
    }
}
