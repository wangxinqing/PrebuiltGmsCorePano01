package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;

/* renamed from: tja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tja {
    public final File a;
    public final ParcelFileDescriptor b;
    public final long c;

    public tja(File file, ParcelFileDescriptor parcelFileDescriptor, long j) {
        this.a = file;
        this.b = parcelFileDescriptor;
        this.c = j;
    }

    public static tja a(ParcelFileDescriptor parcelFileDescriptor) {
        iva.a((Object) parcelFileDescriptor, (Object) "Cannot create Payload.File from null ParcelFileDescriptor.");
        return new tja((File) null, parcelFileDescriptor, parcelFileDescriptor.getStatSize());
    }
}
