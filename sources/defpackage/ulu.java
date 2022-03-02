package defpackage;

import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.Arrays;

/* renamed from: ulu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ulu {
    public static String a(int i) {
        return jjp.d(b(i));
    }

    public static void b() {
        if (aymi.x()) {
            izj.a();
        }
    }

    public static InetAddress c(int i) {
        return InetAddress.getByAddress(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)});
    }

    public static byte[] b(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("[ ");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("0x%02x ", new Object[]{Byte.valueOf(bArr[i])}));
        }
        sb.append("]");
        return sb.toString();
    }

    public static void a() {
        if (aymi.x()) {
            izj.b(9728);
        }
    }

    static void a(BluetoothServerSocket bluetoothServerSocket, String str, String str2) {
        if (bluetoothServerSocket != null) {
            try {
                bluetoothServerSocket.close();
                jjg jjg = ulh.a;
            } catch (IOException e) {
                anih anih = (anih) ulh.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("ulu", "a", 63, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to close %sSocket %s", (Object) str, (Object) str2);
            }
        }
    }

    static void a(BluetoothSocket bluetoothSocket, String str, String str2) {
        if (bluetoothSocket != null) {
            try {
                bluetoothSocket.close();
                jjg jjg = ulh.a;
            } catch (IOException e) {
                anih anih = (anih) ulh.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("ulu", "a", 51, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to close %sSocket %s", (Object) str, (Object) str2);
            }
        }
    }

    public static void a(ServerSocket serverSocket, String str, String str2) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
                jjg jjg = ulh.a;
            } catch (IOException e) {
                anih anih = (anih) ulh.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("ulu", "a", 94, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to close %sSocket %s", (Object) str, (Object) str2);
            }
        }
    }

    public static void a(Socket socket, String str, String str2) {
        if (socket != null) {
            try {
                socket.close();
                jjg jjg = ulh.a;
            } catch (IOException e) {
                anih anih = (anih) ulh.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("ulu", "a", 82, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to close %sSocket %s", (Object) str, (Object) str2);
            }
        }
    }

    public static void a(ull ull, String str, String str2) {
        if (ull != null) {
            try {
                ull.close();
                jjg jjg = ulh.a;
            } catch (IOException e) {
                anih anih = (anih) ulh.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("ulu", "a", 39, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to close %sSocket %s", (Object) str, (Object) str2);
            }
        }
    }

    static void a(uqd uqd, String str, String str2) {
        if (uqd != null) {
            try {
                uqd.close();
                jjg jjg = ulh.a;
            } catch (IOException e) {
                anih anih = (anih) ulh.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("ulu", "a", 106, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to close %sSocket %s", (Object) str, (Object) str2);
            }
        }
    }

    public static byte[] a(byte[] bArr, int i) {
        return Arrays.copyOf(jhg.a(bArr, "SHA-256"), i);
    }
}
