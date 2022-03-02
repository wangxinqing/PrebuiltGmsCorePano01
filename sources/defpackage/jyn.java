package defpackage;

import android.view.InputDevice;
import java.util.HashSet;

/* renamed from: jyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jyn extends qvr implements Runnable {
    final /* synthetic */ jym a;
    private final long b = ((Long) jyo.c.c()).longValue();

    public jyn(jym jym) {
        this.a = jym;
    }

    public final void run() {
        try {
            jym jym = this.a;
            int i = jym.c;
            jyl jyl = jym.a;
            int[] inputDeviceIds = jym.b.getInputDeviceIds();
            HashSet hashSet = new HashSet();
            for (int inputDevice : inputDeviceIds) {
                InputDevice inputDevice2 = jym.b.getInputDevice(inputDevice);
                if (inputDevice2 != null) {
                    String[] a2 = jym.a(inputDevice2);
                    for (String add : a2) {
                        hashSet.add(add);
                    }
                }
            }
            jyl.a((String[]) hashSet.toArray(new String[0]));
        } finally {
            postDelayed(this, this.b);
        }
    }
}
