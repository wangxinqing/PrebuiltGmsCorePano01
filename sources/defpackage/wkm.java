package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: wkm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wkm implements Parcelable.Creator {
    private final Parcelable.Creator a;

    public wkm(Parcelable.Creator creator) {
        this.a = creator;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return (SafeParcelable[]) this.a.newArray(i);
    }

    public static void a(SafeParcelable safeParcelable, Parcel parcel, wkl wkl) {
        Parcel obtain = Parcel.obtain();
        try {
            wkl.a(safeParcelable, obtain);
            byte[] marshall = obtain.marshall();
            File createTempFile = File.createTempFile("teleporter", ".tmp", (File) null);
            RandomAccessFile randomAccessFile = new RandomAccessFile(createTempFile, "rw");
            randomAccessFile.write(marshall);
            randomAccessFile.seek(0);
            createTempFile.delete();
            parcel.writeFileDescriptor(randomAccessFile.getFD());
            randomAccessFile.close();
            obtain.recycle();
        } catch (IOException e) {
            throw new wkn("Couldn't write SafeParcelable to unlinked file.", e);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ParcelFileDescriptor readFileDescriptor = parcel.readFileDescriptor();
        try {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(readFileDescriptor));
            int available = dataInputStream.available();
            byte[] bArr = new byte[available];
            dataInputStream.read(bArr);
            dataInputStream.close();
            readFileDescriptor.close();
            Parcelable.Creator creator = this.a;
            Parcel obtain = Parcel.obtain();
            try {
                obtain.unmarshall(bArr, 0, available);
                obtain.setDataPosition(0);
                Object createFromParcel = creator.createFromParcel(obtain);
                obtain.recycle();
                return (SafeParcelable) createFromParcel;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        } catch (IOException e) {
            throw new wkn("Couldn't read from unlinked file.", e);
        }
    }
}
