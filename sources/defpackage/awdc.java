package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: awdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awdc {
    public final avyj a;
    public final awah b;
    private Proxy c;
    private InetSocketAddress d;
    private List e = Collections.emptyList();
    private int f;
    private List g = Collections.emptyList();
    private int h;
    private final List i = new ArrayList();

    public awdc(avyj avyj, awah awah) {
        this.a = avyj;
        this.b = awah;
        avzd avzd = avyj.a;
        Proxy proxy = avyj.g;
        if (proxy != null) {
            this.e = Collections.singletonList(proxy);
        } else {
            this.e = new ArrayList();
            List<Proxy> select = this.a.f.select(avzd.b());
            if (select != null) {
                this.e.addAll(select);
            }
            this.e.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.e.add(Proxy.NO_PROXY);
        }
        this.f = 0;
    }

    private final boolean c() {
        return this.f < this.e.size();
    }

    private final boolean d() {
        return this.h < this.g.size();
    }

    private final boolean e() {
        return !this.i.isEmpty();
    }

    public final boolean a() {
        return d() || c() || e();
    }

    public final avzo b() {
        String str;
        int i2;
        if (!d()) {
            if (!c()) {
                if (e()) {
                    return (avzo) this.i.remove(0);
                }
                throw new NoSuchElementException();
            } else if (c()) {
                List list = this.e;
                int i3 = this.f;
                this.f = i3 + 1;
                Proxy proxy = (Proxy) list.get(i3);
                this.g = new ArrayList();
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                    str = this.a.a();
                    i2 = this.a.b();
                } else {
                    SocketAddress address = proxy.address();
                    if (address instanceof InetSocketAddress) {
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                        InetAddress address2 = inetSocketAddress.getAddress();
                        if (address2 == null) {
                            str = inetSocketAddress.getHostName();
                        } else {
                            str = address2.getHostAddress();
                        }
                        i2 = inetSocketAddress.getPort();
                    } else {
                        String valueOf = String.valueOf(address.getClass());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                        sb.append("Proxy.address() is not an InetSocketAddress: ");
                        sb.append(valueOf);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                if (i2 <= 0 || i2 > 65535) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 46);
                    sb2.append("No route to ");
                    sb2.append(str);
                    sb2.append(":");
                    sb2.append(i2);
                    sb2.append("; port is out of range");
                    throw new SocketException(sb2.toString());
                }
                if (proxy.type() == Proxy.Type.SOCKS) {
                    this.g.add(InetSocketAddress.createUnresolved(str, i2));
                } else {
                    List a2 = this.a.b.a(str);
                    int size = a2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        this.g.add(new InetSocketAddress((InetAddress) a2.get(i4), i2));
                    }
                }
                this.h = 0;
                this.c = proxy;
            } else {
                String a3 = this.a.a();
                String valueOf2 = String.valueOf(this.e);
                StringBuilder sb3 = new StringBuilder(String.valueOf(a3).length() + 46 + String.valueOf(valueOf2).length());
                sb3.append("No route to ");
                sb3.append(a3);
                sb3.append("; exhausted proxy configurations: ");
                sb3.append(valueOf2);
                throw new SocketException(sb3.toString());
            }
        }
        if (d()) {
            List list2 = this.g;
            int i5 = this.h;
            this.h = i5 + 1;
            this.d = (InetSocketAddress) list2.get(i5);
            avzo avzo = new avzo(this.a, this.c, this.d);
            if (!this.b.c(avzo)) {
                return avzo;
            }
            this.i.add(avzo);
            return b();
        }
        String a4 = this.a.a();
        String valueOf3 = String.valueOf(this.g);
        StringBuilder sb4 = new StringBuilder(String.valueOf(a4).length() + 47 + String.valueOf(valueOf3).length());
        sb4.append("No route to ");
        sb4.append(a4);
        sb4.append("; exhausted inet socket addresses: ");
        sb4.append(valueOf3);
        throw new SocketException(sb4.toString());
    }
}
