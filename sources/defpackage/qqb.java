package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: qqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqb extends qvv {
    static final Long a = Long.valueOf(TimeUnit.SECONDS.toMillis(axvz.a.a().I()));
    static qqb c;
    public final AtomicBoolean b = new AtomicBoolean(false);
    private final Handler d;
    private final Runnable e;

    private qqb(Context context) {
        super("ipa", "MediastoreContentObserver", (Handler) null);
        this.d = new qvr(context.getMainLooper());
        this.e = new qqa(this, context);
    }

    public static void a(Context context) {
        synchronized (qqb.class) {
            if (c == null) {
                c = new qqb(context);
            }
            c.onChange(false);
        }
    }

    public static synchronized void b(Context context) {
        synchronized (qqb.class) {
            if (c == null) {
                c = new qqb(context.getApplicationContext());
                ContentResolver contentResolver = context.getContentResolver();
                try {
                    contentResolver.registerContentObserver(MediaStore.Files.getContentUri("external"), true, c);
                    if (axvz.e()) {
                        contentResolver.registerContentObserver(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, true, c);
                    }
                } catch (NoClassDefFoundError | SecurityException e2) {
                    qoh.a().a(52);
                    qoi.c("Could not register mediastore content observer");
                }
            }
        }
    }

    public static synchronized void c(Context context) {
        synchronized (qqb.class) {
            if (c != null) {
                context.getContentResolver().unregisterContentObserver(c);
                c = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, Uri uri) {
        new Object[1][0] = Boolean.valueOf(z);
        if (!this.b.getAndSet(true)) {
            this.d.postDelayed(this.e, a.longValue());
        }
    }
}
