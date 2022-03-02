package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: bbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bbb {
    public static final float[] a = new float[4];
    private static final PathMeasure b = new PathMeasure();
    private static final Path c = new Path();
    private static final Path d = new Path();
    private static final float e = ((float) Math.sqrt(2.0d));
    private static float f = -1.0f;

    public static float a() {
        if (f == -1.0f) {
            f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f;
    }

    public static int a(float f2, float f3, float f4, float f5) {
        int i = f2 != 0.0f ? (int) (f2 * 527.0f) : 17;
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        if (f4 != 0.0f) {
            i = (int) (((float) (i * 31)) * f4);
        }
        return f5 != 0.0f ? (int) (((float) (i * 31)) * f5) : i;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i < 4) {
            return false;
        }
        if (i > 4) {
            return true;
        }
        if (i2 >= 4) {
            return i2 > 4 || i3 >= 0;
        }
        return false;
    }

    public static float a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float a(Matrix matrix) {
        float[] fArr = a;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f2 = e;
        fArr[2] = f2;
        fArr[3] = f2;
        matrix.mapPoints(fArr);
        float[] fArr2 = a;
        return ((float) Math.hypot((double) (fArr2[2] - fArr2[0]), (double) (fArr2[3] - fArr2[1]))) / 2.0f;
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static Path a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            Path path2 = path;
            path2.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void a(Canvas canvas, RectF rectF, Paint paint) {
        a(canvas, rectF, paint, 31);
    }

    public static void a(Canvas canvas, RectF rectF, Paint paint, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        auf.a();
    }

    public static void a(Path path, float f2, float f3, float f4) {
        b.setPath(path, false);
        float length = b.getLength();
        if (f2 == 1.0f && f3 == 0.0f) {
            auf.a();
        } else if (length < 1.0f || ((double) Math.abs((f3 - f2) - 4.0f)) < 0.01d) {
            auf.a();
        } else {
            float f5 = f2 * length;
            float f6 = f3 * length;
            float f7 = f4 * length;
            float min = Math.min(f5, f6) + f7;
            float max = Math.max(f5, f6) + f7;
            if (min >= length && max >= length) {
                min = (float) bba.a(min, length);
                max = (float) bba.a(max, length);
            }
            if (min < 0.0f) {
                min = (float) bba.a(min, length);
            }
            if (max < 0.0f) {
                max = (float) bba.a(max, length);
            }
            if (min == max) {
                path.reset();
                auf.a();
                return;
            }
            if (min >= max) {
                min -= length;
            }
            c.reset();
            b.getSegment(min, max, c, true);
            if (max > length) {
                d.reset();
                b.getSegment(0.0f, max % length, d, true);
                c.addPath(d);
            } else if (min < 0.0f) {
                d.reset();
                b.getSegment(min + length, length, d, true);
                c.addPath(d);
            }
            path.set(c);
            auf.a();
        }
    }

    public static void a(Path path, awk awk) {
        if (awk != null && !awk.a) {
            a(path, ((awo) awk.b).g() / 100.0f, ((awo) awk.c).g() / 100.0f, ((awo) awk.d).g() / 360.0f);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
            }
        }
    }

    public static boolean a(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }
}
