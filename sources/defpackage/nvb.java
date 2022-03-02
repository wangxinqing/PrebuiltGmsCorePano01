package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/* renamed from: nvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nvb implements Runnable {
    final /* synthetic */ DatagramSocket a;
    final /* synthetic */ int b;
    final /* synthetic */ nvc c;

    public nvb(nvc nvc, DatagramSocket datagramSocket, int i) {
        this.c = nvc;
        this.a = datagramSocket;
        this.b = i;
    }

    public final void run() {
        nvc nvc = this.c;
        DatagramSocket datagramSocket = this.a;
        int i = this.b;
        DatagramPacket datagramPacket = new DatagramPacket(new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES], PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        int af = (int) axlc.a.a().af();
        int i2 = 0;
        while (i2 < af) {
            try {
                datagramSocket.receive(datagramPacket);
                if (datagramPacket.getLength() == 4) {
                    nvc.a.clear();
                    nvc.a.put(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength()).flip();
                    if (nvc.a.getInt() != i) {
                        i2++;
                    } else if (nvc.b()) {
                        break;
                    }
                } else {
                    i2++;
                }
            } catch (IOException e) {
            } catch (Throwable th) {
                datagramSocket.close();
                throw th;
            }
        }
        datagramSocket.close();
        if (i2 >= af) {
            nuj nuj = nvc.b;
            aucd o = ammy.k.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            ammy ammy = (ammy) o.b;
            ammy.b = 6;
            ammy.a |= 1;
            nuj.a(o);
        }
    }
}
