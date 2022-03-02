package defpackage;

/* renamed from: awrd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awrd implements awrc {
    public static final agvx a;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.cast")).a("gms:cast:");
        agvx.a(a2, "allow_mirroring_from_non_google_cast_app", false);
        agvx.a(a2, "audio_mirroring_app_id", "8E6C866D");
        agvx.a(a2, "chromecast_mirror_test_app_package_name", "com.google.android.gms.chromecast_mirroring");
        agvx.a(a2, "google_cast_package_name", "com.google.android.apps.chromecast.app");
        agvx.a(a2, "mirroring_app_id", "674A0243");
        agvx.a(a2, "mirroring:audio_only_overrides", "{}");
        agvx.a(a2, "mirroring:configuration_by_appid_overrides", "{\"D2D81108\":1, \"3185A70D\":1, \"73C3383F\":1, \"059F814C\":1, \"C01EB1F7\":1, \"00871CBD\":1, \"2118165A\":1, \"0C67B152\":1, \"7FB4C367\":1}");
        agvx.a(a2, "mirroring:default_configuration", 2);
        agvx.a(a2, "mirroring_enabled", true);
        agvx.a(a2, "mirroring:interactive_non_realtime_overrides", "{}");
        agvx.a(a2, "mirroring:interactive_realtime_overrides", "{\"targetDelay\":100}");
        agvx.a(a2, "mirroring:logging_enabled", true);
        agvx.a(a2, "mirroring:logging_valid_time_ms", 300000);
        agvx.a(a2, "mirroring:non_interactive_overrides", "{}");
        agvx.a(a2, "mirroring:system_mirroring_overrides", "{}");
        agvx.a(a2, "mirroring:video_bitrate", 6000000);
        agvx.a(a2, "mirroring:video_framerate_denominator", 1001);
        agvx.a(a2, "mirroring:video_framerate_numerator", 60000);
        agvx.a(a2, "mirroring:video_height", 720);
        agvx.a(a2, "mirroring:video_width", 1280);
        a = agvx.a(a2, "stats_flags", 0);
        agvx.a(a2, "v19_mirroring_metadat_configuration", true);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }
}
