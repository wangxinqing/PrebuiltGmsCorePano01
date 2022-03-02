package defpackage;

import com.google.android.gms.location.reporting.UploadRequest;
import java.util.Arrays;

/* renamed from: ajnb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajnb implements ajnc {
    public final long a;
    public final long b;
    public final UploadRequest c;
    public final String d;

    public ajnb(long j, long j2, UploadRequest uploadRequest, String str) {
        this.a = j;
        this.b = j2;
        iva.a((Object) uploadRequest, (Object) "request");
        this.c = uploadRequest;
        this.d = str;
    }

    public final String a() {
        UploadRequest uploadRequest = this.c;
        String str = uploadRequest.b;
        String str2 = uploadRequest.f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final String a(boolean z) {
        return !z ? "stationary" : "default";
    }

    public final long b(boolean z) {
        return !z ? this.c.e : this.c.d;
    }

    public final String b() {
        return "burst";
    }

    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajnb) {
            ajnb ajnb = (ajnb) obj;
            if (this.a != ajnb.a || this.b != ajnb.b || !this.c.equals(ajnb.c) || !atiu.a(this.d, ajnb.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d});
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        String valueOf = String.valueOf(this.c);
        String str = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 116 + String.valueOf(str).length());
        sb.append("IdentifiedUploadRequest{mId=");
        sb.append(j);
        sb.append(", mElapsedRealtime=");
        sb.append(j2);
        sb.append(", mRequest=");
        sb.append(valueOf);
        sb.append(", mSourcePackage=");
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
