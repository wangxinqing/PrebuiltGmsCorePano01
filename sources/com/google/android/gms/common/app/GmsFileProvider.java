package com.google.android.gms.common.app;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GmsFileProvider extends ki {
    static final String[] a = new String[0];
    private boolean b = false;

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (awzf.a.a().a()) {
            try {
                super.attachInfo(context, providerInfo);
            } catch (IllegalArgumentException e) {
                this.b = true;
            }
        } else {
            super.attachInfo(context, providerInfo);
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        if (!this.b) {
            return super.delete(uri, str, strArr);
        }
        return 0;
    }

    public final String getType(Uri uri) {
        if (!this.b) {
            return super.getType(uri);
        }
        return null;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        if (!this.b) {
            return super.openFile(uri, str);
        }
        throw new FileNotFoundException("FileProvider creation failed.");
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (this.b) {
            return new MatrixCursor(a);
        }
        return super.query(uri, strArr, str, strArr2, str2);
    }
}
