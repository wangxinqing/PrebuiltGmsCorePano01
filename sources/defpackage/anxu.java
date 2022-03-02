package defpackage;

/* renamed from: anxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum anxu implements auco {
    UNKNOWN_CONTEXT(0),
    NOW_SERVICE(1),
    CALL_MANAGER(2),
    VANAGON_LIFETIME(3),
    ACTIVATION(4),
    PROJECTED_LIFETIME(5),
    STARTUP_PERF(6),
    LIFETIME(7),
    DIAGNOSTICS(8),
    LOCATION(9),
    SETTINGS(10),
    HATS_SURVEY(11),
    PERMISSIONS(12),
    MESSAGING(13),
    AUTO_LAUNCH(14),
    PLAY_STORE(15),
    CLOUD_CARD_SERVICE(16),
    NOTIFICATION_LISTENER(17),
    EXPERIMENT(18),
    MEDIA_SESSION(19),
    DRIVING_MODE(20),
    MEDIA_BROWSE(21),
    LENS_SWITCHER(22),
    BLUETOOTH(23),
    DRIVING_MODE_GEARHEAD_SETTING_COPIER(24),
    DRIVING_MODE_DND_SETTING_COPIER(25),
    COMPATIBLE_APPS(26),
    CAR_SERVICE(27),
    FZERO(28),
    CRASH_CONTEXT(29),
    DRIVING_MODE_LOCATION(30),
    SYSTEM_UI(31),
    WIRELESS(32),
    PROCESS_PRIORITY(33),
    CALL_CLIENT_CALL_ADAPTER(34),
    TESTING(35);
    
    public final int K;

    private anxu(int i) {
        this.K = i;
    }

    public final int a() {
        return this.K;
    }

    public final String toString() {
        return Integer.toString(this.K);
    }
}
