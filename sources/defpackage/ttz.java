package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import com.google.android.gms.nearby.discovery.fastpair.BistoPairingProgressHandler$2;
import java.io.ByteArrayOutputStream;

/* renamed from: ttz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ttz extends twf {
    public boolean a;
    public final nla b = new BistoPairingProgressHandler$2(this, "bisto-setup");
    private final arxt f;
    private final tvo g;
    private final tuh h;
    private final boolean i;
    private String j;

    public ttz(Context context, ttg ttg, arxt arxt, tvo tvo, boolean z) {
        super(context, ttg);
        this.f = arxt;
        this.g = tvo;
        this.i = z;
        this.h = (tuh) thl.a(context, tuh.class);
    }

    private final Intent a(ttg ttg, String str) {
        Integer num;
        byte[] bArr = new byte[0];
        if (ttg.A() != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ttg.A().compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            double d = 0.75d;
            while (byteArrayOutputStream.size() > 500000) {
                Bitmap A = ttg.A();
                double width = (double) ttg.A().getWidth();
                double sqrt = Math.sqrt(d);
                Double.isNaN(width);
                double height = (double) ttg.A().getHeight();
                double sqrt2 = Math.sqrt(d);
                Double.isNaN(height);
                Bitmap.createScaledBitmap(A, (int) (width * sqrt), (int) (height * sqrt2), true).compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                d *= d;
            }
            bArr = byteArrayOutputStream.toByteArray();
        }
        Intent putExtra = new Intent().setPackage("com.google.android.googlequicksearchbox").setAction("com.google.android.apps.gsa.bisto.FAST_PAIR").putExtra("com.google.android.gms.nearby.discovery.PUBLIC_ADDRESS", amrk.b(this.j)).putExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS", ttg.m()).putExtra("com.google.android.gms.nearby.discovery.fastpair.DEVICE_NAME", ttg.k()).putExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID", ttg.G()).putExtra("com.google.android.gms.nearby.discovery.fastpair.PAIRING_STATE", str).putExtra("com.google.android.gms.nearby.discovery.fastpair.DEVICE_IMAGE", jhy.d(bArr));
        if (aymz.b()) {
            tuh tuh = this.h;
            String m = ttg.m();
            if (tuh.b.containsValue(m)) {
                num = (Integer) tuh.b.a().get(m);
            } else if (tuh.b.containsValue(m)) {
                num = (Integer) tuh.b.a().get(m);
            } else {
                Integer valueOf = Integer.valueOf(tuh.a.getAndIncrement());
                tuh.b.put(valueOf, m);
                num = valueOf;
            }
            putExtra.putExtra("com.google.android.gms.nearby.discovery.CONNECTION_ID", num);
        }
        return putExtra;
    }

    public final aspb b() {
        return aspb.BISTO_PAIR_END;
    }

    public final void c() {
        String str;
        super.c();
        tvo tvo = this.g;
        tvo.a(tvo.a);
        ttg ttg = this.d;
        if (!this.i) {
            str = "CONNECTING";
        } else {
            str = "RETROACTIVE_CONNECTING";
        }
        Intent a2 = a(ttg, str);
        this.c.sendBroadcast(a2);
        ((anih) tsp.a.d()).a("BistoPairingProgressHandler: Sent pairing setup completed %s", (Object) a2.toUri(1));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.nearby.discovery.ACTION_CANCEL_BISTO_SETUP");
        intentFilter.addAction("com.google.android.gms.nearby.discovery.ACTION_SUCCESS_BISTO_SETUP");
        this.c.registerReceiver(this.b, intentFilter);
        this.a = true;
        ((arwg) thl.a(this.c, arwg.class)).a(new tty(this, "CancelBistoSetupReceiver"), aymt.a.a().bb());
    }

    public final void b(String str) {
        super.b(str);
        Intent a2 = a(this.d, "SUCCESS");
        this.c.sendBroadcast(a2);
        this.g.a(true, this.i, this.d.m(), this.j);
        ((anih) tsp.a.d()).a("BistoPairingProgressHandler: Sent pairing success %s", (Object) a2.toUri(1));
    }

    public final aspb a() {
        return aspb.BISTO_PAIR_START;
    }

    public final String a(aeha aeha, byte[] bArr, arxt arxt, String str) {
        if (this.i) {
            return tvk.a(this.c, aeha, this.d, str);
        }
        return super.a(aeha, bArr, arxt, str);
    }

    public final void a(aehy aehy) {
        super.a(aehy);
        if (this.i) {
            aehy.n(true);
            aehy.i(aymw.u());
        }
    }

    public final void a(String str) {
        String str2;
        super.a(str);
        this.j = str;
        ttg ttg = this.d;
        if (!this.i) {
            str2 = "CONNECTING";
        } else {
            str2 = "RETROACTIVE_CONNECTING";
        }
        Intent a2 = a(ttg, str2);
        this.c.sendBroadcast(a2);
        ((anih) tsp.a.d()).a("BistoPairingProgressHandler: Sent get bluetooth address %s", (Object) a2.toUri(1));
    }

    public final void a(Throwable th) {
        super.a(th);
        Intent a2 = a(this.d, "FAILED");
        this.c.sendBroadcast(a2);
        this.g.a(false, this.i, this.d.m(), this.j);
        ((anih) tsp.a.d()).a("BistoPairingProgressHandler: Sent pairing failed %s", (Object) a2.toUri(1));
    }

    public final byte[] a(byte[] bArr, aeha aeha, aegz aegz) {
        byte[] a2 = super.a(bArr, aeha, aegz);
        if (a2 != null) {
            return a2;
        }
        if (!this.i || (a2 = aegz.a()) == null || this.f.d() == null) {
            return a2;
        }
        this.g.a(this.f.d().name, aeha.b(a2));
        return a2;
    }
}
