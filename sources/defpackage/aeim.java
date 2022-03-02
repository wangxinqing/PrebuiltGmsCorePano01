package defpackage;

import android.net.Uri;
import com.google.android.libraries.bluetooth.fastpair.AutoValue_TrueWirelessHeadset;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;

/* renamed from: aeim  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeim {
    public Uri a;
    private String b;
    private HeadsetPiece c;
    private HeadsetPiece d;
    private HeadsetPiece e;
    private Long f;
    private String g;
    private Long h;

    public final TrueWirelessHeadset a() {
        String str = this.b == null ? " name" : "";
        if (this.c == null) {
            str = str.concat(" leftBud");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" rightBud");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" headsetCase");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" lastUpdateElapsedRealtimeMillis");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" modelId");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" firstObservationTimestampMillis");
        }
        if (str.isEmpty()) {
            return new AutoValue_TrueWirelessHeadset(this.b, this.c, this.d, this.e, this.f.longValue(), this.g, this.h.longValue(), this.a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(long j) {
        this.f = Long.valueOf(j);
    }

    public final void c(HeadsetPiece headsetPiece) {
        if (headsetPiece != null) {
            this.d = headsetPiece;
            return;
        }
        throw new NullPointerException("Null rightBud");
    }

    public final void b(HeadsetPiece headsetPiece) {
        if (headsetPiece != null) {
            this.c = headsetPiece;
            return;
        }
        throw new NullPointerException("Null leftBud");
    }

    public final void b(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final void a(long j) {
        this.h = Long.valueOf(j);
    }

    public final void a(HeadsetPiece headsetPiece) {
        if (headsetPiece != null) {
            this.e = headsetPiece;
            return;
        }
        throw new NullPointerException("Null headsetCase");
    }

    public final void a(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null modelId");
    }
}
