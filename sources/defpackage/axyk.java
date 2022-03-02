package defpackage;

/* renamed from: axyk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axyk implements axyj {
    public static final agvx chreCcClearcutAccountEnabled;
    public static final agvx chreCcClearcutLoggingEnabled;
    public static final agvx chreCcFalseNotificationConfidenceThreshold;
    public static final agvx chreCcFalseNotificationEnabled;
    public static final agvx chreCcFalseNotificationText;
    public static final agvx chreCcFalseNotificationTitle;
    public static final agvx chreCcFalseNotificationUri;
    public static final agvx chreCcHealthNotificationEnabled;
    public static final agvx chreCcHealthNotificationText;
    public static final agvx chreCcHealthNotificationTitle;
    public static final agvx chreCcNotificationConfidenceThreshold;
    public static final agvx chreCcNotificationEnabled;
    public static final agvx chreCcNotificationText;
    public static final agvx chreCcNotificationTitle;
    public static final agvx chreCcNotificationUri;
    public static final agvx chreCcTestModelEnabled;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        chreCcClearcutAccountEnabled = agvx.a(a, "chre_cc_clearcut_account_enabled", false);
        chreCcClearcutLoggingEnabled = agvx.a(a, "chre_cc_clearcut_logging_enabled", false);
        chreCcFalseNotificationConfidenceThreshold = agvx.a(a, "chre_cc_false_notification_confidence_threshold", 0.0d);
        chreCcFalseNotificationEnabled = agvx.a(a, "chre_cc_false_notification_enabled", false);
        chreCcFalseNotificationText = agvx.a(a, "chre_cc_false_notification_text", "");
        chreCcFalseNotificationTitle = agvx.a(a, "chre_cc_false_notification_title", "");
        chreCcFalseNotificationUri = agvx.a(a, "chre_cc_false_notification_uri", "");
        chreCcHealthNotificationEnabled = agvx.a(a, "chre_cc_health_notification_enabled", false);
        chreCcHealthNotificationText = agvx.a(a, "chre_cc_health_notification_text", "");
        chreCcHealthNotificationTitle = agvx.a(a, "chre_cc_health_notification_title", "");
        chreCcNotificationConfidenceThreshold = agvx.a(a, "chre_cc_notification_confidence_threshold", 0.5d);
        chreCcNotificationEnabled = agvx.a(a, "chre_cc_notification_enabled", false);
        chreCcNotificationText = agvx.a(a, "chre_cc_notification_text", "");
        chreCcNotificationTitle = agvx.a(a, "chre_cc_notification_title", "");
        chreCcNotificationUri = agvx.a(a, "chre_cc_notification_uri", "");
        chreCcTestModelEnabled = agvx.a(a, "chre_cc_detection_enabled", false);
    }

    public boolean chreCcClearcutAccountEnabled() {
        return ((Boolean) chreCcClearcutAccountEnabled.c()).booleanValue();
    }

    public boolean chreCcClearcutLoggingEnabled() {
        return ((Boolean) chreCcClearcutLoggingEnabled.c()).booleanValue();
    }

    public double chreCcFalseNotificationConfidenceThreshold() {
        return ((Double) chreCcFalseNotificationConfidenceThreshold.c()).doubleValue();
    }

    public boolean chreCcFalseNotificationEnabled() {
        return ((Boolean) chreCcFalseNotificationEnabled.c()).booleanValue();
    }

    public String chreCcFalseNotificationText() {
        return (String) chreCcFalseNotificationText.c();
    }

    public String chreCcFalseNotificationTitle() {
        return (String) chreCcFalseNotificationTitle.c();
    }

    public String chreCcFalseNotificationUri() {
        return (String) chreCcFalseNotificationUri.c();
    }

    public boolean chreCcHealthNotificationEnabled() {
        return ((Boolean) chreCcHealthNotificationEnabled.c()).booleanValue();
    }

    public String chreCcHealthNotificationText() {
        return (String) chreCcHealthNotificationText.c();
    }

    public String chreCcHealthNotificationTitle() {
        return (String) chreCcHealthNotificationTitle.c();
    }

    public double chreCcNotificationConfidenceThreshold() {
        return ((Double) chreCcNotificationConfidenceThreshold.c()).doubleValue();
    }

    public boolean chreCcNotificationEnabled() {
        return ((Boolean) chreCcNotificationEnabled.c()).booleanValue();
    }

    public String chreCcNotificationText() {
        return (String) chreCcNotificationText.c();
    }

    public String chreCcNotificationTitle() {
        return (String) chreCcNotificationTitle.c();
    }

    public String chreCcNotificationUri() {
        return (String) chreCcNotificationUri.c();
    }

    public boolean chreCcTestModelEnabled() {
        return ((Boolean) chreCcTestModelEnabled.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }
}
