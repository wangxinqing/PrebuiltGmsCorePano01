package defpackage;

import com.google.android.location.collectionlib.RealCollectorConfig;
import com.google.android.location.collectionlib.utils.ParcelableSensorScannerConfig;
import java.util.Set;

/* renamed from: ahue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahue {
    public Set a;
    public String b = null;
    public byte[] c = null;
    public long d = 0;
    public long e;
    public boolean f = false;
    public ahuu g = null;
    public boolean h = true;
    public aizx i = null;
    public int j;

    public final RealCollectorConfig a() {
        ParcelableSensorScannerConfig parcelableSensorScannerConfig;
        if (this.a.contains(ahup.RAW_AUDIO)) {
            amrl.b(false);
            amrl.b(false);
        }
        ahuu ahuu = this.g;
        if (ahuu != null) {
            parcelableSensorScannerConfig = new ParcelableSensorScannerConfig(ahuu);
        } else {
            parcelableSensorScannerConfig = null;
        }
        return new RealCollectorConfig(this.a, this.f, this.d, 0, this.e, parcelableSensorScannerConfig, this.j, this.b, this.c, this.h, this.i, false, -1, -1);
    }

    public final void a(long j2) {
        this.e = j2;
        this.f = false;
        this.g = null;
    }
}
