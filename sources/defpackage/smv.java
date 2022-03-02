package defpackage;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.nfc.NfcAdapter;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.Response;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import com.google.android.gms.mdm.receivers.LockscreenChimeraReceiver;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* renamed from: smv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class smv extends TracingIntentService {
    protected String a;
    protected boolean b;
    public String[] c;

    public smv() {
        super("GcmReceiverChimeraService");
        setIntentRedelivery(true);
    }

    public static void a(Context context) {
        NfcAdapter defaultAdapter;
        snb.d(context);
        if (!azfk.c() && (defaultAdapter = NfcAdapter.getDefaultAdapter(context)) != null) {
            if (!azfk.e() || !jkr.h()) {
                snb.a(defaultAdapter);
            } else if (!defaultAdapter.isSecureNfcSupported() || defaultAdapter.isSecureNfcEnabled()) {
                snb.a(defaultAdapter);
            } else {
                snb.a = true;
                if (defaultAdapter.isEnabled()) {
                    defaultAdapter.enableSecureNfc(true);
                } else {
                    defaultAdapter.enable();
                    defaultAdapter.enableSecureNfc(true);
                    defaultAdapter.disable();
                }
                snn.b("Enable Secure NFC", new Object[0]);
            }
        }
        LockscreenChimeraReceiver.a(true);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(long j);

    /* access modifiers changed from: protected */
    public abstract void a(avuh avuh);

    /* access modifiers changed from: protected */
    public abstract void a(avup avup);

    /* access modifiers changed from: protected */
    public void a(avuj[] avujArr, Location location, String str, avue avue, Response.Listener listener, Response.ErrorListener errorListener) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract void b(Intent intent);

    /* access modifiers changed from: protected */
    public abstract void b(avuh avuh);

    /* access modifiers changed from: protected */
    public final void b(avuj avuj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            snn.d("Don't call on the main thread", new Object[0]);
        }
        RequestFuture newFuture = RequestFuture.newFuture();
        a(avuj, (Location) null, this.a, newFuture, newFuture);
        try {
            avul avul = (avul) newFuture.get();
        } catch (InterruptedException e) {
            snn.a(e, "Unable to send response", new Object[0]);
            Thread.currentThread().interrupt();
            avul avul2 = avul.a;
        } catch (ExecutionException e2) {
            snn.a(e2, "Unable to send response", new Object[0]);
            avul avul3 = avul.a;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void c();

    /* access modifiers changed from: protected */
    public abstract void d();

    public final void onCreate() {
        super.onCreate();
        this.c = TextUtils.split("@googlemail.com", ",");
    }

    public smv(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        avuj b2 = snb.b(this, true);
        if (b2 == avuj.AUTO_ENABLE_ALREADY_DEVICE_ADMINISTRATOR || b2 == avuj.SUCCESS) {
            return true;
        }
        snn.c("Device admin policy is not auto enabled. Response code: %s", b2);
        a(avup.DEVICE_ADMIN_NOT_ENABLED);
        a(avuj.UNABLE_TO_PERFORM_ACTION_NOT_DEVICE_ADMINISTRATOR);
        return false;
    }

    protected static final boolean a(String str, byte[] bArr) {
        byte[] a2 = jhg.a(str.toLowerCase(Locale.US), "SHA-256");
        return a2 != null && a2.length > 0 && Arrays.equals(a2, bArr);
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        Throwable th;
        acrz acrz;
        if (!jix.a((Context) this) && intent != null) {
            try {
                acrz = new acrz(this, 1, "com.google.android.gms.mdm.services.GcmReceiverService", (String) null, "com.google.android.gms", "SECURITY");
                try {
                    acrz.b();
                    b(intent);
                    if (acrz.e()) {
                        acrz.c();
                    }
                    nsi.a(this, intent);
                } catch (Throwable th2) {
                    th = th2;
                    if (acrz != null && acrz.e()) {
                        acrz.c();
                    }
                    nsi.a(this, intent);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                acrz = null;
                acrz.c();
                nsi.a(this, intent);
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(avuj avuj) {
        a(avuj, (Location) null, this.a, (Response.Listener) null, (Response.ErrorListener) null);
    }

    /* access modifiers changed from: protected */
    public final void a(avuj avuj, Location location, String str, Response.Listener listener, Response.ErrorListener errorListener) {
        a(new avuj[]{avuj}, location, str, (avue) null, listener, errorListener);
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        a(snb.b(this, z));
    }
}
