package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FileTeleporter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new mwl();
    public ParcelFileDescriptor a;
    public final String b;
    public final String c;
    public byte[] d;
    private File e;

    public FileTeleporter(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.a = parcelFileDescriptor;
        this.b = str;
        this.c = str2;
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            Log.w("FileTeleporter", "Could not close stream", e2);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            File file = this.e;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.a = ParcelFileDescriptor.open(createTempFile, 268435456);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                        try {
                            dataOutputStream.writeInt(this.d.length);
                            dataOutputStream.writeUTF(this.b);
                            dataOutputStream.writeUTF(this.c);
                            dataOutputStream.write(this.d);
                            a((Closeable) dataOutputStream);
                        } catch (IOException e2) {
                            throw new IllegalStateException("Could not write into unlinked file", e2);
                        } catch (Throwable th) {
                            a((Closeable) dataOutputStream);
                            throw th;
                        }
                    } catch (FileNotFoundException e3) {
                        throw new IllegalStateException("Temporary file is somehow already deleted.");
                    }
                } catch (IOException e4) {
                    throw new IllegalStateException("Could not create temporary file:", e4);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
            }
        }
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.b(parcel, a2);
    }

    public FileTeleporter(byte[] bArr, String str, String str2) {
        this((ParcelFileDescriptor) null, str, str2);
        this.d = bArr;
    }

    public final void a(File file) {
        if (file != null) {
            this.e = file;
            return;
        }
        throw new NullPointerException("Cannot set null temp directory");
    }
}
