package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.zip.CRC32;

/* renamed from: aeqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeqc implements Runnable {
    final /* synthetic */ aeqd a;

    public aeqc(aeqd aeqd) {
        this.a = aeqd;
    }

    public final void run() {
        int length;
        aorr aorr = this.a.d.d;
        if (aorr == null) {
            ((pdg) this.a.f.a()).a("MDH FutureCoalescer missing result failure", new IllegalStateException());
            return;
        }
        try {
            auke auke = (auke) aorl.a((Future) aorr);
            try {
                aeqn aeqn = this.a.c;
                synchronized (aeqn.e) {
                    String[] a2 = aeqn.a();
                    if (a2 == null) {
                        if (!aeqn.b.mkdirs()) {
                            String valueOf = String.valueOf(aeqn.b);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                            sb.append("directory ");
                            sb.append(valueOf);
                            sb.append(" did not exist and I couldn't create it.");
                            throw new FileNotFoundException(sb.toString());
                        }
                    }
                    long j = 0;
                    if (a2 != null && (length = a2.length) > 0) {
                        String str = a2[length - 1];
                        Matcher matcher = aeqn.d.matcher(str);
                        if (matcher.matches()) {
                            j = Long.parseLong(matcher.group(1), 16) + 1;
                        } else {
                            ((pia) aeqn.a.a()).d("filename %s failed pattern %s", str, aeqn.d.toString());
                            throw new RuntimeException("filename should have passed through StoredFilesFilter!?");
                        }
                    }
                    String format = String.format("%s_%016X", new Object[]{aeqn.c, Long.valueOf(j)});
                    afgk afgk = aeqn.f;
                    ByteBuffer allocate = ByteBuffer.allocate(afgl.a(auke));
                    int position = allocate.position() + afgl.a(auke);
                    if (allocate.capacity() < position) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(position);
                        allocate2.order(allocate.order());
                        allocate.flip();
                        allocate2.put(allocate);
                        allocate = allocate2;
                    }
                    int position2 = allocate.position();
                    allocate.putInt(0);
                    int position3 = allocate.position();
                    aubk a3 = aubk.a(allocate);
                    auke.a(a3);
                    a3.c();
                    int position4 = allocate.position() - position3;
                    allocate.putInt(position2, position4);
                    byte[] array = allocate.array();
                    int arrayOffset = allocate.arrayOffset() + position3;
                    CRC32 crc32 = new CRC32();
                    crc32.update(array, arrayOffset, position4);
                    allocate.putLong(crc32.getValue());
                    allocate.flip();
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(aeqn.b, format));
                    try {
                        fileOutputStream.getChannel().write(allocate);
                        fileOutputStream.close();
                        aeqn.a(10);
                    } catch (Throwable th) {
                        apev.a(th, th);
                    }
                }
                return;
            } catch (IOException e) {
                ((pia) this.a.b.a()).e("Channel config write failed.", new Object[0]);
                ((pdg) this.a.f.a()).a("MDH channel config write failure", e);
                return;
            }
        } catch (ExecutionException e2) {
            ((pdg) this.a.f.a()).a("MDH channel config retrieval failure", e2);
            return;
        }
        throw th;
    }
}
