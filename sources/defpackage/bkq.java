package defpackage;

import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: bkq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bkq {
    public static long a(byte[] bArr, File file, File file2, boolean z) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        bkp bkp = new bkp();
        bma.a((Closeable) a(wrap, file, file2, bkp, z, false));
        return bkp.a;
    }

    public static apxg b(FileInputStream fileInputStream) {
        MappedByteBuffer a = a(fileInputStream);
        if (apxg.a((ByteBuffer) a, "FTMR")) {
            try {
                return apxg.b((ByteBuffer) a);
            } catch (IndexOutOfBoundsException e) {
                throw new InvalidConfigException("metadata out of bounds", e);
            }
        } else {
            throw new InvalidConfigException("file identifier not found");
        }
    }

    public static boz c(FileInputStream fileInputStream) {
        MappedByteBuffer a = a(fileInputStream);
        System.currentTimeMillis();
        if (apxg.a((ByteBuffer) a, "CHMR")) {
            try {
                boz a2 = boz.a((ByteBuffer) a);
                if (a2.f() != null) {
                    return a2;
                }
                throw new InvalidConfigException("missing required field");
            } catch (IndexOutOfBoundsException e) {
                throw new InvalidConfigException("metadata out of bounds", e);
            }
        } else {
            throw new InvalidConfigException("file identifier not found");
        }
    }

    public static File a(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            File dir = context.getDir("chimera", 0);
            if (dir == null) {
                dir = new File("/dev/null");
            } else {
                try {
                    dir = dir.getCanonicalFile();
                } catch (IOException e) {
                }
            }
            return dir;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* JADX INFO: finally extract failed */
    public static FileInputStream a(ByteBuffer byteBuffer, File file, File file2, bkp bkp, boolean z, boolean z2) {
        bps a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (z2) {
                try {
                    a = bps.a("SHA-256");
                    ByteBuffer order = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
                    order.putInt(0, byteBuffer.remaining());
                    fileOutputStream.write(order.array());
                    a(byteBuffer, fileOutputStream, a);
                    fileOutputStream.write(a.digest());
                    a.a();
                } catch (NoSuchAlgorithmException e) {
                    try {
                        throw new IOException(e);
                    } catch (Throwable th) {
                        fileOutputStream.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    apev.a(th, th2);
                }
            } else {
                a(byteBuffer, fileOutputStream, (bps) null);
            }
            fileOutputStream.close();
            if (z) {
                File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    bma.c(parentFile);
                }
                bma.d(file);
            }
            long lastModified = file.lastModified();
            if (lastModified != 0) {
                long lastModified2 = file2.lastModified();
                if (lastModified <= lastModified2) {
                    file.setLastModified(lastModified2 + 1000);
                    lastModified = file.lastModified();
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                if (file.renameTo(file2)) {
                    bkp.a = lastModified;
                    file.delete();
                    return fileInputStream;
                }
                bma.a((Closeable) fileInputStream);
                throw new IOException("Failed to rename pending to live config file");
            }
            throw new IOException("Failed to get pending config file last modified time");
            throw th;
        } catch (IOException e2) {
            try {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("ConfigFileUtils", valueOf.length() == 0 ? new String("Failed to write config file: ") : "Failed to write config file: ".concat(valueOf));
                file.delete();
                bkp.a = 0;
                return null;
            } catch (Throwable th3) {
                file.delete();
                throw th3;
            }
        } catch (Throwable th4) {
            apev.a(th, th4);
        }
    }

    static MappedByteBuffer a(FileInputStream fileInputStream) {
        System.currentTimeMillis();
        FileChannel channel = fileInputStream.getChannel();
        long size = channel.size();
        if (size > 44) {
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, size);
            if (map != null) {
                map.order(ByteOrder.LITTLE_ENDIAN);
                int i = ((int) size) - 32;
                int i2 = i - 4;
                try {
                    int i3 = map.getInt();
                    if (i2 == i3) {
                        byte[] bArr = new byte[32];
                        map.position(i);
                        map.get(bArr);
                        map.position(4);
                        map.limit(i);
                        int i4 = 0;
                        while (true) {
                            if (i4 < 32) {
                                if (bArr[i4] != 0) {
                                    break;
                                }
                                i4++;
                            } else {
                                a((ByteBuffer) map);
                                break;
                            }
                        }
                        int i5 = map.getInt(4);
                        if (i5 < i2) {
                            return map;
                        }
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("fb offset ");
                        sb.append(i5);
                        sb.append(" >= config size ");
                        sb.append(i2);
                        throw new InvalidConfigException(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("config size ");
                    sb2.append(i2);
                    sb2.append(" != prefix size ");
                    sb2.append(i3);
                    throw new InvalidConfigException(sb2.toString());
                } catch (IndexOutOfBoundsException | BufferUnderflowException e) {
                    throw new InvalidConfigException("file read exception", e);
                }
            } else {
                throw new InvalidConfigException("file map returned null");
            }
        } else {
            throw new InvalidConfigException("file too small");
        }
    }

    public static void a(InputStream inputStream, byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            int read = inputStream.read(bArr, i, length - i);
            if (read <= 0) {
                break;
            }
            i += read;
        }
        if (i < length) {
            throw new IOException(String.format("Input file too short (expected %d, got %d)", new Object[]{Integer.valueOf(length), Integer.valueOf(i)}));
        }
    }

    public static void a(ByteBuffer byteBuffer) {
        bps a;
        int capacity = byteBuffer.capacity();
        if (capacity - byteBuffer.limit() == 32) {
            ByteBuffer duplicate = byteBuffer.duplicate();
            try {
                a = bps.a("SHA-256");
                int remaining = duplicate.remaining();
                int min = Math.min(remaining, FragmentTransaction.TRANSIT_EXIT_MASK);
                byte[] bArr = new byte[min];
                while (remaining > 0) {
                    int min2 = Math.min(remaining, min);
                    duplicate.get(bArr, 0, min2);
                    a.update(bArr, 0, min2);
                    remaining -= min2;
                }
                duplicate.limit(capacity);
                byte[] bArr2 = new byte[32];
                duplicate.get(bArr2);
                if (Arrays.equals(a.digest(), bArr2)) {
                    a.a();
                    return;
                }
                throw new InvalidConfigException("config checksum mismatch");
            } catch (IndexOutOfBoundsException | BufferUnderflowException | NoSuchAlgorithmException e) {
                throw new InvalidConfigException(e);
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            throw new InvalidConfigException("config checksum not found");
        }
        throw th;
    }

    private static void a(ByteBuffer byteBuffer, FileOutputStream fileOutputStream, bps bps) {
        int remaining = byteBuffer.remaining();
        int min = Math.min(remaining, FragmentTransaction.TRANSIT_EXIT_MASK);
        byte[] bArr = new byte[min];
        while (remaining > 0) {
            int min2 = Math.min(remaining, min);
            byteBuffer.get(bArr, 0, min2);
            if (bps != null) {
                bps.update(bArr, 0, min2);
            }
            fileOutputStream.write(bArr, 0, min2);
            remaining -= min2;
        }
    }

    public static byte[] a(File file) {
        FileInputStream fileInputStream;
        System.currentTimeMillis();
        try {
            fileInputStream = new FileInputStream(file);
            int size = (int) fileInputStream.getChannel().size();
            if (size > 1048576) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("Config file ");
                sb.append(valueOf);
                sb.append(" is too large to read (");
                sb.append(size);
                sb.append(" > ");
                sb.append(1048576);
                sb.append(")");
                Log.e("ConfigFileUtils", sb.toString());
                fileInputStream.close();
                return null;
            }
            byte[] bArr = new byte[size];
            int i = 0;
            while (true) {
                int read = fileInputStream.read(bArr, i, size - i);
                if (read <= 0) {
                    break;
                }
                i += read;
            }
            if (i >= size) {
                fileInputStream.close();
                return bArr;
            }
            throw new IOException(String.format("file too short (expected %d, got %d)", new Object[]{Integer.valueOf(size), Integer.valueOf(i)}));
        } catch (IOException e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("ConfigFileUtils", valueOf2.length() == 0 ? new String("Failed to read config file: ") : "Failed to read config file: ".concat(valueOf2));
            return null;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
