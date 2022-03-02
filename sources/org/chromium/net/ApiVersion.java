package org.chromium.net;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ApiVersion {
    private static final int API_LEVEL = 13;
    private static final String CRONET_VERSION = "82.0.4081.3";
    private static final String LAST_CHANGE = "031a82a10118469ef88f1a62e949eaeabb5b08a0-refs/branch-heads/4081@{#5}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return "82.0.4081.3@" + LAST_CHANGE.substring(0, 8);
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 13;
    }
}
