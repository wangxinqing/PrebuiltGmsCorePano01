package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ilf();
    final int a;
    public ParcelFileDescriptor b;
    final int c;
    public boolean d;
    private Bitmap e;
    private File f;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = i2;
        this.e = null;
        this.d = false;
    }

    private static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            Log.w("BitmapTeleporter", "Could not close stream", e2);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            Bitmap bitmap = this.e;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            File file = this.f;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.b = ParcelFileDescriptor.open(createTempFile, 268435456);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                        try {
                            dataOutputStream.writeInt(array.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(array);
                            a((Closeable) dataOutputStream);
                        } catch (IOException e2) {
                            throw new IllegalStateException("Could not write into unlinked file", e2);
                        } catch (Throwable th) {
                            a((Closeable) dataOutputStream);
                            throw th;
                        }
                    } catch (FileNotFoundException e3) {
                        throw new IllegalStateException("Temporary file is somehow already deleted");
                    }
                } catch (IOException e4) {
                    throw new IllegalStateException("Could not create temporary file", e4);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
        }
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, i | 1, false);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, a2);
        this.b = null;
    }

    public BitmapTeleporter(Bitmap bitmap) {
        this.a = 1;
        this.b = null;
        this.c = 0;
        this.e = bitmap;
        this.d = true;
    }

    public final Bitmap a() {
        if (!this.d) {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.b));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                int readInt = dataInputStream.readInt();
                int readInt2 = dataInputStream.readInt();
                Bitmap.Config valueOf = Bitmap.Config.valueOf(dataInputStream.readUTF());
                dataInputStream.read(bArr);
                a((Closeable) dataInputStream);
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                Bitmap createBitmap = Bitmap.createBitmap(readInt, readInt2, valueOf);
                createBitmap.copyPixelsFromBuffer(wrap);
                this.e = createBitmap;
                this.d = true;
            } catch (IOException e2) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e2);
            } catch (Throwable th) {
                a((Closeable) dataInputStream);
                throw th;
            }
        }
        return this.e;
    }

    public final void a(File file) {
        if (file != null) {
            this.f = file;
            return;
        }
        throw new NullPointerException("Cannot set null temp directory");
    }
}
