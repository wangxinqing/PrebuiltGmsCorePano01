package com.google.android.gms.ipa.mediastoreindexer;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.IBinder;
import android.provider.MediaStore;
import com.google.android.chimera.BoundService;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MediastoreCorporaInstantIndexingBoundService extends BoundService {
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (axvz.i()) {
            printWriter.println("Media store indexer:");
            printWriter.format("DB version: %d\n", new Object[]{3});
            qsf qsf = new qsf(getContentResolver(), (qof) null);
            qsd a = qse.a();
            a.f = 1;
            a.a = 0L;
            a.c = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            a.d = new String[]{"_id"};
            Cursor a2 = qsf.a(a.a());
            if (a2 != null) {
                try {
                    printWriter.format("Image media source size: %d\n", new Object[]{Integer.valueOf(a2.getCount())});
                } catch (Throwable th) {
                    apev.a(th, th);
                }
            }
            if (a2 != null) {
                a2.close();
            }
            Cursor a3 = new qsx(qsy.a((Context) this)).a();
            try {
                printWriter.format("Intermediate store size: %d\n", new Object[]{Integer.valueOf(a3.getCount())});
                if (a3 != null) {
                    a3.close();
                    return;
                }
                return;
            } catch (Throwable th2) {
                apev.a(th, th2);
            }
        } else {
            printWriter.println("Mediastore indexer not enabled.");
            return;
        }
        throw th;
        throw th;
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        if (axvz.i() && !axvz.g()) {
            qqb.b(getApplicationContext());
        }
    }

    public final void onDestroy() {
        qqb.c(getApplicationContext());
    }
}
