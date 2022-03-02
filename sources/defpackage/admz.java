package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Locale;

/* renamed from: admz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class admz {
    private static final iwd a = adnt.e("PayloadMetadataDownloadUtil");

    public static boolean a(Context context, String str) {
        FileChannel channel;
        Throwable th;
        Context context2 = context;
        String str2 = str;
        amrl.a(jkr.c());
        amri a2 = adnd.a("payload_metadata.bin");
        if (!a2.a()) {
            amri a3 = adnd.a("payload.bin");
            if (!a3.a()) {
                return false;
            }
            adnu a4 = adoc.a(context);
            a4.a = str2;
            a4.h = admw.a();
            a4.b = adna.a(context2, "payload_header.bin", adjx.c());
            a4.f = admx.a(context);
            a4.d = ((adkc) a3.b()).b;
            a4.e = 24;
            a4.a().a();
            try {
                File file = new File(admy.a().getAbsolutePath(), "payload_header.bin");
                ByteBuffer allocate = ByteBuffer.allocate(24);
                channel = new FileInputStream(file).getChannel();
                if (channel.read(allocate) == 24) {
                    allocate.flip();
                    int i = allocate.getInt();
                    if (i == 1131561301) {
                        long j = allocate.getLong();
                        if (j == 2) {
                            long j2 = allocate.getLong() + 24 + ((long) allocate.getInt());
                            if (channel != null) {
                                channel.close();
                            }
                            a2 = amri.b(new adkc("payload_metadata.bin", ((adkc) a3.b()).b, j2));
                        } else {
                            throw new IOException(String.format(Locale.US, "Invalid file format version: [%d].", new Object[]{Long.valueOf(j)}));
                        }
                    } else {
                        throw new IOException(String.format("Invalid magic: [0x%x].", new Object[]{Integer.valueOf(i)}));
                    }
                } else {
                    throw new IOException(String.format(Locale.US, "Cannot read %d bytes from payload header file.", new Object[]{24}));
                }
            } catch (IOException e) {
                a.e("Cannot get the payload metadata.", e, new Object[0]);
                return false;
            } catch (Throwable th2) {
                apev.a(th, th2);
            }
        }
        adnu a5 = adoc.a(context);
        a5.a = str2;
        a5.h = admw.a();
        a5.b = adna.a(context2, "payload_metadata.bin", adjx.c());
        a5.f = admx.a(context);
        a5.d = ((adkc) a2.b()).b;
        a5.e = ((adkc) a2.b()).c;
        a5.a().a();
        return true;
        throw th;
    }
}
