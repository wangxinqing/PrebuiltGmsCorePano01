package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: ajpm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajpm {
    public final Context a;
    public volatile byte[] b;
    public final String c = "geofencer_ks";

    public final aiab a() {
        irk.a((Object) this.b, (Object) "createCipher needs to be called after createOrLoadKey");
        return aiab.a(this.b, (ajrh) null);
    }

    public final byte[] b() {
        Throwable th;
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2 = null;
        try {
            dataInputStream = new DataInputStream(this.a.openFileInput(this.c));
            try {
                dataInputStream.readUnsignedShort();
                byte[] bArr = new byte[32];
                dataInputStream.readFully(bArr);
                ajre.a((Closeable) dataInputStream);
                return bArr;
            } catch (FileNotFoundException e) {
                boolean z = aikq.a;
                ajre.a((Closeable) dataInputStream);
                return null;
            } catch (EOFException e2) {
                boolean z2 = aikq.a;
                ajre.a((Closeable) dataInputStream);
                return null;
            } catch (IOException e3) {
                boolean z3 = aikq.a;
                ajre.a((Closeable) dataInputStream);
                return null;
            }
        } catch (FileNotFoundException e4) {
            dataInputStream = null;
            boolean z4 = aikq.a;
            ajre.a((Closeable) dataInputStream);
            return null;
        } catch (EOFException e5) {
            dataInputStream = null;
            boolean z22 = aikq.a;
            ajre.a((Closeable) dataInputStream);
            return null;
        } catch (IOException e6) {
            dataInputStream = null;
            boolean z32 = aikq.a;
            ajre.a((Closeable) dataInputStream);
            return null;
        } catch (Throwable th2) {
            DataInputStream dataInputStream3 = dataInputStream;
            th = th2;
            dataInputStream2 = dataInputStream3;
            ajre.a((Closeable) dataInputStream2);
            throw th;
        }
    }

    public ajpm(Context context) {
        this.a = context;
    }
}
