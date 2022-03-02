package com.android.volley;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DefaultRetryPolicy implements RetryPolicy {
    public static final float DEFAULT_BACKOFF_MULT = 1.0f;
    public static final int DEFAULT_MAX_RETRIES = 1;
    public static final int DEFAULT_TIMEOUT_MS = 2500;
    private int a;
    private int b;
    private final int c;
    private final float d;

    public DefaultRetryPolicy() {
        this(DEFAULT_TIMEOUT_MS, 1, 1.0f);
    }

    public float getBackoffMultiplier() {
        return this.d;
    }

    public int getCurrentRetryCount() {
        return this.b;
    }

    public int getCurrentTimeout() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public boolean hasAttemptRemaining() {
        return this.b <= this.c;
    }

    public void retry(VolleyError volleyError) {
        this.b++;
        int i = this.a;
        this.a = i + ((int) (((float) i) * this.d));
        if (!hasAttemptRemaining()) {
            throw volleyError;
        }
    }

    public DefaultRetryPolicy(int i, int i2, float f) {
        this.a = i;
        this.c = i2;
        this.d = f;
    }
}
