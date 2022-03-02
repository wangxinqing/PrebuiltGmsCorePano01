package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* renamed from: kg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class kg extends ke {
    private final kj c = new kj(this);
    private Uri d;
    private String[] e;
    private String f;
    private String[] g;
    private String h;
    private Cursor i;
    private mo j;

    public kg(Context context) {
        super(context);
    }

    public void cancelLoadInBackground() {
        synchronized (this) {
            mo moVar = this.j;
            if (moVar != null) {
                moVar.b();
            }
        }
    }

    public void deliverResult(Cursor cursor) {
        if (!isReset()) {
            Cursor cursor2 = this.i;
            this.i = cursor;
            if (isStarted()) {
                super.deliverResult(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.d);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.e));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.g));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.h);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.i);
    }

    public String[] getProjection() {
        return this.e;
    }

    public String getSelection() {
        return this.f;
    }

    public String[] getSelectionArgs() {
        return this.g;
    }

    public String getSortOrder() {
        return this.h;
    }

    public Uri getUri() {
        return this.d;
    }

    public Cursor loadInBackground() {
        Object obj;
        Cursor query;
        synchronized (this) {
            if (!isLoadInBackgroundCanceled()) {
                this.j = new mo();
            } else {
                throw new mu();
            }
        }
        try {
            ContentResolver contentResolver = getContext().getContentResolver();
            Uri uri = this.d;
            String[] strArr = this.e;
            String str = this.f;
            String[] strArr2 = this.g;
            String str2 = this.h;
            mo moVar = this.j;
            int i2 = Build.VERSION.SDK_INT;
            if (moVar != null) {
                try {
                    int i3 = Build.VERSION.SDK_INT;
                    synchronized (moVar) {
                        if (moVar.b == null) {
                            moVar.b = new CancellationSignal();
                            if (moVar.a) {
                                ((CancellationSignal) moVar.b).cancel();
                            }
                        }
                        obj = moVar.b;
                    }
                } catch (Exception e2) {
                    if (e2 instanceof OperationCanceledException) {
                        throw new mu();
                    }
                    throw e2;
                }
            } else {
                obj = null;
            }
            query = contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
            if (query != null) {
                query.getCount();
                query.registerContentObserver(this.c);
            }
            synchronized (this) {
                this.j = null;
            }
            return query;
        } catch (RuntimeException e3) {
            query.close();
            throw e3;
        } catch (Throwable th) {
            synchronized (this) {
                this.j = null;
                throw th;
            }
        }
    }

    public void onCanceled(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* access modifiers changed from: protected */
    public void onReset() {
        onStopLoading();
        Cursor cursor = this.i;
        if (cursor != null && !cursor.isClosed()) {
            this.i.close();
        }
        this.i = null;
    }

    /* access modifiers changed from: protected */
    public void onStartLoading() {
        Cursor cursor = this.i;
        if (cursor != null) {
            deliverResult(cursor);
        }
        if (takeContentChanged() || this.i == null) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public void onStopLoading() {
        cancelLoad();
    }

    public void setProjection(String[] strArr) {
        this.e = strArr;
    }

    public void setSelection(String str) {
        this.f = str;
    }

    public void setSelectionArgs(String[] strArr) {
        this.g = strArr;
    }

    public void setSortOrder(String str) {
        this.h = str;
    }

    public void setUri(Uri uri) {
        this.d = uri;
    }

    public kg(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.d = uri;
        this.e = strArr;
        this.f = str;
        this.g = strArr2;
        this.h = str2;
    }
}
