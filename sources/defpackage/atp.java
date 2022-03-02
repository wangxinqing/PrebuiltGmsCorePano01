package defpackage;

import android.os.IBinder;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* renamed from: atp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atp extends atl {
    private static final Charset f = Charset.forName("UTF-16");
    int d = 0;
    int e = -1;
    private final DataInputStream g;
    private final DataOutputStream h;
    private final DataInputStream i;
    private DataOutputStream j;
    private ato k;
    private boolean l;
    private int m = -1;

    public atp(InputStream inputStream, OutputStream outputStream, ou ouVar, ou ouVar2, ou ouVar3) {
        super(ouVar, ouVar2, ouVar3);
        DataInputStream dataInputStream;
        DataOutputStream dataOutputStream = null;
        if (inputStream != null) {
            dataInputStream = new DataInputStream(new atn(this, inputStream));
        } else {
            dataInputStream = null;
        }
        this.g = dataInputStream;
        dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : dataOutputStream;
        this.h = dataOutputStream;
        this.i = this.g;
        this.j = dataOutputStream;
    }

    public final boolean a() {
        return true;
    }

    public final void b() {
        int i2;
        ato ato = this.k;
        if (ato != null) {
            try {
                if (ato.a.size() != 0) {
                    ato ato2 = this.k;
                    ato2.b.flush();
                    int size = ato2.a.size();
                    int i3 = ato2.c << 16;
                    if (size >= 65535) {
                        i2 = 65535;
                    } else {
                        i2 = size;
                    }
                    ato2.d.writeInt(i3 | i2);
                    if (size >= 65535) {
                        ato2.d.writeInt(size);
                    }
                    ato2.a.writeTo(ato2.d);
                }
                this.k = null;
            } catch (IOException e2) {
                throw new atk(e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final atl c() {
        return new atp(this.i, this.j, this.a, this.b, this.c);
    }

    public final int d() {
        try {
            return this.i.readInt();
        } catch (IOException e2) {
            throw new atk(e2);
        }
    }

    public final long e() {
        try {
            return this.i.readLong();
        } catch (IOException e2) {
            throw new atk(e2);
        }
    }

    public final String f() {
        try {
            int readInt = this.i.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.i.readFully(bArr);
            return new String(bArr, f);
        } catch (IOException e2) {
            throw new atk(e2);
        }
    }

    public final IBinder g() {
        return null;
    }

    public final byte[] h() {
        try {
            int readInt = this.i.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.i.readFully(bArr);
            return bArr;
        } catch (IOException e2) {
            throw new atk(e2);
        }
    }

    /* access modifiers changed from: protected */
    public final CharSequence i() {
        return null;
    }

    public final Parcelable j() {
        return null;
    }

    public final boolean k() {
        try {
            return this.i.readBoolean();
        } catch (IOException e2) {
            throw new atk(e2);
        }
    }

    public final void a(int i2) {
        try {
            this.j.writeInt(i2);
        } catch (IOException e2) {
            throw new atk(e2);
        }
    }

    public final void c(int i2) {
        b();
        ato ato = new ato(i2, this.h);
        this.k = ato;
        this.j = ato.b;
    }

    public final void a(long j2) {
        try {
            this.j.writeLong(j2);
        } catch (IOException e2) {
            throw new atk(e2);
        }
    }

    public final void a(IBinder iBinder) {
        if (!this.l) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    public final void a(Parcelable parcelable) {
        if (!this.l) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    /* access modifiers changed from: protected */
    public final void a(CharSequence charSequence) {
        if (!this.l) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    public final boolean b(int i2) {
        while (true) {
            try {
                int i3 = this.m;
                if (i3 == i2) {
                    return true;
                }
                if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                    return false;
                }
                int i4 = this.d;
                int i5 = this.e;
                if (i4 < i5) {
                    this.g.skip((long) (i5 - i4));
                }
                this.e = -1;
                int readInt = this.g.readInt();
                this.d = 0;
                int i6 = (char) readInt;
                if (i6 == 65535) {
                    i6 = this.g.readInt();
                }
                this.m = (char) (readInt >> 16);
                this.e = i6;
            } catch (IOException e2) {
                return false;
            }
        }
    }

    public final void a(String str) {
        if (str != null) {
            try {
                byte[] bytes = str.getBytes(f);
                this.j.writeInt(bytes.length);
                this.j.write(bytes);
            } catch (IOException e2) {
                throw new atk(e2);
            }
        } else {
            this.j.writeInt(-1);
        }
    }

    public final void a(boolean z) {
        try {
            this.j.writeBoolean(z);
        } catch (IOException e2) {
            throw new atk(e2);
        }
    }

    public final void a(boolean z, boolean z2) {
        if (z) {
            this.l = z2;
            return;
        }
        throw new RuntimeException("Serialization of this object is not allowed");
    }

    public final void a(byte[] bArr) {
        if (bArr != null) {
            try {
                this.j.writeInt(bArr.length);
                this.j.write(bArr);
            } catch (IOException e2) {
                throw new atk(e2);
            }
        } else {
            this.j.writeInt(-1);
        }
    }
}
