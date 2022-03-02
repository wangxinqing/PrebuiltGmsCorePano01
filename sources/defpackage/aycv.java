package defpackage;

/* renamed from: aycv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aycv implements aycu {
    public static final agvx showOnOffStatusForLocationAccuracy;
    public static final agvx showOnOffStatusForLocationSharing;
    public static final agvx showSummaryForLocationAccuracy;
    public static final agvx showSummaryForLocationHistory;
    public static final agvx showSummaryForLocationSharing;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        showOnOffStatusForLocationAccuracy = agvx.a(a, "InjectedServices__show_on_off_status_for_location_accuracy", true);
        showOnOffStatusForLocationSharing = agvx.a(a, "InjectedServices__show_on_off_status_for_location_sharing", true);
        showSummaryForLocationAccuracy = agvx.a(a, "InjectedServices__show_summary_for_location_accuracy", false);
        showSummaryForLocationHistory = agvx.a(a, "InjectedServices__show_summary_for_location_history", false);
        showSummaryForLocationSharing = agvx.a(a, "InjectedServices__show_summary_for_location_sharing", false);
    }

    public boolean compiled() {
        return true;
    }

    public boolean showOnOffStatusForLocationAccuracy() {
        return ((Boolean) showOnOffStatusForLocationAccuracy.c()).booleanValue();
    }

    public boolean showOnOffStatusForLocationSharing() {
        return ((Boolean) showOnOffStatusForLocationSharing.c()).booleanValue();
    }

    public boolean showSummaryForLocationAccuracy() {
        return ((Boolean) showSummaryForLocationAccuracy.c()).booleanValue();
    }

    public boolean showSummaryForLocationHistory() {
        return ((Boolean) showSummaryForLocationHistory.c()).booleanValue();
    }

    public boolean showSummaryForLocationSharing() {
        return ((Boolean) showSummaryForLocationSharing.c()).booleanValue();
    }
}
