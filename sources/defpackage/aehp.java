package defpackage;

import android.net.Uri;
import com.google.android.libraries.bluetooth.fastpair.AutoValue_HeadsetPiece;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;

/* renamed from: aehp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aehp {
    public Uri a;
    private Integer b;
    private Integer c;
    private String d;
    private Boolean e;

    public final HeadsetPiece a() {
        String str = this.b == null ? " lowLevelThreshold" : "";
        if (this.c == null) {
            str = str.concat(" batteryLevel");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" imageUrl");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" charging");
        }
        if (str.isEmpty()) {
            return new AutoValue_HeadsetPiece(this.b.intValue(), this.c.intValue(), this.d, this.e.booleanValue(), this.a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public final void b(int i) {
        this.b = Integer.valueOf(i);
    }

    public final void a(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void a(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null imageUrl");
    }

    public final void a(boolean z) {
        this.e = Boolean.valueOf(z);
    }
}
