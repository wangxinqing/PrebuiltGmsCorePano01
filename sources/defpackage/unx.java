package defpackage;

import java.io.IOException;

/* renamed from: unx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class unx implements Runnable {
    private final uoa a;
    private final String b;
    private final String c;

    public unx(uoa uoa, String str, String str2) {
        this.a = uoa;
        this.b = str;
        this.c = str2;
    }

    public final void run() {
        uoa uoa = this.a;
        String str = this.b;
        String str2 = this.c;
        if (uoa.a(uoh.a(str, str2, false), 13)) {
            try {
                uoa.b = new unu(str, str2, uoh.a(uoa.a));
            } catch (IOException e) {
                throw new RuntimeException(String.format("Failed to start a Wifi AP with SSID %s because we couldn't get the IP address.", new Object[]{str}), e);
            }
        } else {
            throw new RuntimeException(String.format("Failed to start a Wifi AP with SSID %s because setting the AP state failed.", new Object[]{str}));
        }
    }
}
