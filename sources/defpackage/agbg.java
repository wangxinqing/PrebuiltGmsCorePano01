package defpackage;

import android.graphics.Path;
import android.util.Property;
import com.google.android.libraries.onegoogle.account.disc.RingView;

/* renamed from: agbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agbg extends Property {
    public agbg(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((RingView) obj).d);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        boolean z;
        RingView ringView = (RingView) obj;
        int intValue = ((Integer) obj2).intValue();
        if (intValue != ringView.d) {
            boolean z2 = true;
            if (ringView.b != -1) {
                z = true;
            } else {
                z = false;
            }
            amrl.b(z, (Object) "setRingThickness should be called before setCurrThickness");
            if (ringView.c == -1) {
                z2 = false;
            }
            amrl.b(z2, (Object) "setRingRadius should be called before setCurrThickness");
            ringView.d = intValue;
            int i = ringView.c;
            int i2 = ringView.b;
            ringView.a.reset();
            Path path = ringView.a;
            float f = (float) ringView.c;
            path.addCircle(f, f, (float) ((i - i2) + intValue), Path.Direction.CW);
            ringView.invalidate();
        }
    }
}
