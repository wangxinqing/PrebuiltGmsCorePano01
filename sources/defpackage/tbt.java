package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: tbt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tbt implements ahcn {
    public final iby a;
    private final ahbj b;

    public tbt(Context context) {
        ahbj ahbj = new ahbj();
        this.a = tcb.a(context.getApplicationContext());
        this.b = ahbj;
    }

    private final ParcelFileDescriptor a(Uri uri, int i) {
        return (ParcelFileDescriptor) a("open file", (Callable) new tbq(this, uri, i));
    }

    public final String a() {
        return "android";
    }

    public final ahbj b() {
        return this.b;
    }

    public final OutputStream c(Uri uri) {
        return new tbs(a(uri, 1));
    }

    public final void d(Uri uri) {
        a("delete file", (Callable) new tbo(this, uri));
    }

    public final OutputStream e(Uri uri) {
        throw new ahbp("openForAppend not supported by android");
    }

    public final void f(Uri uri) {
        throw new ahbp("deleteDirectory not supported by android");
    }

    public final boolean g(Uri uri) {
        throw new ahbp("isDirectory not supported by android");
    }

    public final void h(Uri uri) {
        throw new ahbp("createDirectory not supported by android");
    }

    public final long i(Uri uri) {
        throw new ahbp("fileSize not supported by android");
    }

    public final Iterable j(Uri uri) {
        throw new ahbp("children not supported by android");
    }

    public final File k(Uri uri) {
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("Cannot convert uri to file android ");
        sb.append(valueOf);
        throw new ahbp(sb.toString());
    }

    private static final Object a(String str, Callable callable) {
        try {
            return callable.call();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException(str.length() == 0 ? new String("Unable to ") : "Unable to ".concat(str), e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof ibr) {
                ibr ibr = (ibr) cause;
                if (ibr.a() == 33500) {
                    String b2 = ibr.b();
                    StringBuilder sb = new StringBuilder(str.length() + 19 + String.valueOf(b2).length());
                    sb.append("Unable to ");
                    sb.append(str);
                    sb.append(" because ");
                    sb.append(b2);
                    throw new FileNotFoundException(sb.toString());
                } else if (ibr.a() == 10 && !TextUtils.isEmpty(ibr.b()) && ibr.b().startsWith("File not found:")) {
                    String b3 = ibr.b();
                    StringBuilder sb2 = new StringBuilder(str.length() + 19 + String.valueOf(b3).length());
                    sb2.append("Unable to ");
                    sb2.append(str);
                    sb2.append(" because ");
                    sb2.append(b3);
                    throw new FileNotFoundException(sb2.toString());
                }
            }
            throw new IOException(str.length() == 0 ? new String("Unable to ") : "Unable to ".concat(str), e2);
        } catch (Exception e3) {
            throw new IOException(str.length() == 0 ? new String("Unable to ") : "Unable to ".concat(str), e3);
        }
    }

    public final InputStream b(Uri uri) {
        return new tbr(a(uri, 0));
    }

    public final void a(Uri uri, Uri uri2) {
        a("rename file", (Callable) new tbp(this, uri, uri2));
    }

    public final boolean a(Uri uri) {
        try {
            ParcelFileDescriptor a2 = a(uri, 0);
            if (a2 == null) {
                return true;
            }
            a2.close();
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }
}
