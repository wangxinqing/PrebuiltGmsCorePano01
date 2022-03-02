package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.google.android.chimera.ContentProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fonts.FontFetchResult;
import com.google.android.gms.fonts.FontMatchSpec;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: nhh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class nhh extends ContentProvider {
    private static final Status b = new Status(23500, ngf.g(23500));
    private static final Status c = new Status(23510, ngf.g(23510));
    private static final Status d = new Status(23511, ngf.g(23511));
    private static final Status e = new Status(23516, ngf.g(23516));
    final ngx a = new ngx();
    private final AtomicLong f = new AtomicLong(1);
    private final amth g;

    protected nhh() {
        amtm a2 = amtm.a();
        a2.a(100);
        a2.a(60, TimeUnit.SECONDS);
        this.g = a2.d();
    }

    private static void a(MatrixCursor matrixCursor, int i) {
        matrixCursor.addRow(new Object[]{0, 0, null, 0, 0, Integer.valueOf(i)});
    }

    /* access modifiers changed from: protected */
    public abstract long a();

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return "application/x-font-ttf";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        try {
            try {
                Long valueOf = Long.valueOf(Long.parseLong(uri.getPath().substring(1)));
                ngz.b("FontsContentProvider", "Pulling font file for id = %d, cache size = %d", valueOf, Long.valueOf(this.g.d()));
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.g.b(valueOf);
                if (parcelFileDescriptor != null) {
                    return parcelFileDescriptor.dup();
                }
                return null;
            } catch (Exception e2) {
                ngz.a("FontsContentProvider", (Throwable) e2, "Error getting file from cache. Returning null", new Object[0]);
                return null;
            }
        } catch (Exception e3) {
            ngz.a("FontsContentProvider", (Throwable) e3, "Error converting path of URI [%s] to long. Returning null", uri.toString());
            return null;
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        boolean z;
        String str3;
        iva.a((Object) strArr2);
        if (strArr2.length > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        String str4 = strArr2[0];
        ngz.b("FontsContentProvider", "Received query %s, URI %s", str4, uri.toString());
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"});
        try {
            FontMatchSpec fontMatchSpec = (FontMatchSpec) nha.a(str4).get(0);
            ngz.b("FontsContentProvider", "Query [%s] resolved to %s", strArr2[0], fontMatchSpec);
            nhf a2 = nhz.a.a();
            if (a2 == null) {
                ngz.a("FontsContentProvider", "No FontServer as SharedState init failed or not complete", new Object[0]);
                a(matrixCursor, 2);
                this.a.a(e);
                return matrixCursor;
            }
            if (!jkr.b()) {
                str3 = "com.google.android.gms.fonts.nocaller.unavailable";
            } else {
                try {
                    str3 = getCallingPackage();
                } catch (SecurityException e2) {
                    ngz.a("FontsContentProvider", (Throwable) e2, "Unable to get calling package", new Object[0]);
                    str3 = "com.google.android.gms.fonts.nocaller.security";
                }
            }
            if (str3 == null) {
                str3 = "com.google.android.gms.fonts.nocaller.null";
            }
            try {
                FontFetchResult fontFetchResult = (FontFetchResult) a2.a(fontMatchSpec, str3).get(a(), TimeUnit.MILLISECONDS);
                ngz.b("FontsContentProvider", "Fetch %s end status %s", fontMatchSpec, fontFetchResult.b);
                if (fontFetchResult.b.c()) {
                    Long valueOf = Long.valueOf(this.f.getAndIncrement());
                    ngz.c("FontsContentProvider", "Saving PFD to cache with id = %d, cache size = %d", valueOf, Long.valueOf(this.g.d()));
                    this.g.a(valueOf, fontFetchResult.d);
                    matrixCursor.addRow(new Object[]{valueOf, 0, null, Integer.valueOf(fontFetchResult.e.d), Float.valueOf(fontFetchResult.e.e), 0});
                    this.a.a(Status.a);
                } else {
                    if (!fontFetchResult.b.equals(nhf.c)) {
                        a(matrixCursor, 1);
                    } else {
                        a(matrixCursor, 2);
                    }
                    this.a.a(c);
                }
            } catch (TimeoutException e3) {
                ngz.a("FontsContentProvider", (Throwable) e3, "Fetch %s failed due to timeout", fontMatchSpec);
                a(matrixCursor, 2);
                this.a.a(Status.d);
            } catch (InterruptedException | ExecutionException e4) {
                ngz.a("FontsContentProvider", e4, "Fetch %s failed", fontMatchSpec);
                a(matrixCursor, 1);
                this.a.a(d);
            }
            return matrixCursor;
        } catch (Exception e5) {
            ngz.a("FontsContentProvider", "%s is not a valid query", str4);
            a(matrixCursor, 3);
            this.a.a(b);
            return matrixCursor;
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        return openFile(uri, str);
    }
}
