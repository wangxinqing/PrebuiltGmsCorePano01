package defpackage;

import android.app.PendingIntent;

/* renamed from: aipz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class aipz extends aipr {
    long q;

    public aipz(PendingIntent pendingIntent, long j, long j2, ajbg ajbg, ajrb ajrb, boolean z, boolean z2, String str) {
        super(pendingIntent, j2, ajbg, ajrb, z, z2, str);
        this.q = j;
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.h.hashCode());
        String str = this.j;
        String str2 = this.m;
        long j = this.q;
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 86 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("IntentReceiver [pendingIntent=");
        sb.append(hexString);
        sb.append(", packageName=");
        sb.append(str);
        sb.append(", tag=");
        sb.append(str2);
        sb.append(", periodMillis=");
        sb.append(j);
        sb.append("]");
        return sb.toString();
    }
}
