package com.google.android.gms.backup;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ParcelableBackupDataOutput extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator CREATOR = new gsx();
    public final ParcelFileDescriptor a;

    public ParcelableBackupDataOutput(ParcelFileDescriptor parcelFileDescriptor) {
        iva.a((Object) parcelFileDescriptor);
        this.a = parcelFileDescriptor;
    }

    public final void a(gsc gsc) {
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(this.a.getFileDescriptor())));
        try {
            dataOutputStream.writeUTF(((grw) gsc).a);
            dataOutputStream.writeInt(((grw) gsc).b);
            dataOutputStream.write(aooa.a((Collection) ((grw) gsc).c), 0, Math.max(((grw) gsc).b, 0));
            dataOutputStream.close();
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void close() {
        this.a.close();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.b(parcel, a2);
    }
}
