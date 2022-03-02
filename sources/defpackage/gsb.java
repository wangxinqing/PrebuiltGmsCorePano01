package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gsb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gsb {
    public static List a(ParcelFileDescriptor parcelFileDescriptor) {
        ArrayList arrayList = new ArrayList();
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(parcelFileDescriptor.getFileDescriptor())));
        while (true) {
            try {
                String readUTF = dataInputStream.readUTF();
                int readInt = dataInputStream.readInt();
                int max = Math.max(readInt, 0);
                byte[] bArr = new byte[max];
                dataInputStream.read(bArr, 0, max);
                arrayList.add(gsc.a(readUTF, readInt, bArr));
            } catch (EOFException e) {
                dataInputStream.close();
                return arrayList;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        }
        throw th;
    }
}
