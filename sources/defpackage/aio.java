package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.zip.CRC32;

/* renamed from: aio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aio {
    private static final aim[] A = {new aim("NewSubfileType", 254, 4), new aim("SubfileType", 255, 4), new aim("ThumbnailImageWidth", PSKKeyManager.MAX_KEY_LENGTH_BYTES), new aim("ThumbnailImageLength", 257), new aim("BitsPerSample", 258, 3), new aim("Compression", 259, 3), new aim("PhotometricInterpretation", 262, 3), new aim("ImageDescription", 270, 2), new aim("Make", 271, 2), new aim("Model", 272, 2), new aim("StripOffsets", 273), new aim("ThumbnailOrientation", 274, 3), new aim("SamplesPerPixel", 277, 3), new aim("RowsPerStrip", 278), new aim("StripByteCounts", 279), new aim("XResolution", 282, 5), new aim("YResolution", 283, 5), new aim("PlanarConfiguration", 284, 3), new aim("ResolutionUnit", 296, 3), new aim("TransferFunction", 301, 3), new aim("Software", 305, 2), new aim("DateTime", 306, 2), new aim("Artist", 315, 2), new aim("WhitePoint", 318, 5), new aim("PrimaryChromaticities", 319, 5), new aim("SubIFDPointer", 330, 4), new aim("JPEGInterchangeFormat", 513, 4), new aim("JPEGInterchangeFormatLength", 514, 4), new aim("YCbCrCoefficients", 529, 5), new aim("YCbCrSubSampling", 530, 3), new aim("YCbCrPositioning", 531, 3), new aim("ReferenceBlackWhite", 532, 5), new aim("Copyright", 33432, 2), new aim("ExifIFDPointer", 34665, 4), new aim("GPSInfoIFDPointer", 34853, 4), new aim("DNGVersion", 50706, 1), new aim("DefaultCropSize", 50720)};
    private static final aim B = new aim("StripOffsets", 273, 3);
    private static final aim[] C = {new aim("ThumbnailImage", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 7), new aim("CameraSettingsIFDPointer", 8224, 4), new aim("ImageProcessingIFDPointer", 8256, 4)};
    private static final aim[] D = {new aim("PreviewImageStart", 257, 4), new aim("PreviewImageLength", 258, 4)};
    private static final aim[] E = {new aim("AspectFrame", 4371, 3)};
    private static final aim[] F;
    private static final aim[] G = {new aim("SubIFDPointer", 330, 4), new aim("ExifIFDPointer", 34665, 4), new aim("GPSInfoIFDPointer", 34853, 4), new aim("InteroperabilityIFDPointer", 40965, 4), new aim("CameraSettingsIFDPointer", 8224, 1), new aim("ImageProcessingIFDPointer", 8256, 1)};
    private static final HashMap[] H = new HashMap[10];
    private static final HashMap[] I = new HashMap[10];
    private static final HashSet J = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    private static final HashMap K = new HashMap();
    private static final byte[] L = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(h);
    public static final int[] a = {8, 8, 8};
    public static final int[] b = {8};
    static final byte[] c = {-1, -40, -1};
    static final String[] d = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] e = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] f = {65, 83, 67, 73, 73, 0, 0, 0};
    static final aim[][] g;
    static final Charset h;
    static final byte[] i;
    private static final byte[] j = {102, 116, 121, 112};
    private static final byte[] k = {109, 105, 102, 49};
    private static final byte[] l = {104, 101, 105, 99};
    private static final byte[] m = {79, 76, 89, 77, 80, 0};
    private static final byte[] n = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] o = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] p = {101, 88, 73, 102};
    private static final byte[] q = {73, 72, 68, 82};
    private static final byte[] r = {73, 69, 78, 68};
    private static final byte[] s = {82, 73, 70, 70};
    private static final byte[] t = {87, 69, 66, 80};
    private static final byte[] u = {69, 88, 73, 70};
    private static SimpleDateFormat v;
    private static final aim[] w = {new aim("NewSubfileType", 254, 4), new aim("SubfileType", 255, 4), new aim("ImageWidth", PSKKeyManager.MAX_KEY_LENGTH_BYTES), new aim("ImageLength", 257), new aim("BitsPerSample", 258, 3), new aim("Compression", 259, 3), new aim("PhotometricInterpretation", 262, 3), new aim("ImageDescription", 270, 2), new aim("Make", 271, 2), new aim("Model", 272, 2), new aim("StripOffsets", 273), new aim("Orientation", 274, 3), new aim("SamplesPerPixel", 277, 3), new aim("RowsPerStrip", 278), new aim("StripByteCounts", 279), new aim("XResolution", 282, 5), new aim("YResolution", 283, 5), new aim("PlanarConfiguration", 284, 3), new aim("ResolutionUnit", 296, 3), new aim("TransferFunction", 301, 3), new aim("Software", 305, 2), new aim("DateTime", 306, 2), new aim("Artist", 315, 2), new aim("WhitePoint", 318, 5), new aim("PrimaryChromaticities", 319, 5), new aim("SubIFDPointer", 330, 4), new aim("JPEGInterchangeFormat", 513, 4), new aim("JPEGInterchangeFormatLength", 514, 4), new aim("YCbCrCoefficients", 529, 5), new aim("YCbCrSubSampling", 530, 3), new aim("YCbCrPositioning", 531, 3), new aim("ReferenceBlackWhite", 532, 5), new aim("Copyright", 33432, 2), new aim("ExifIFDPointer", 34665, 4), new aim("GPSInfoIFDPointer", 34853, 4), new aim("SensorTopBorder", 4, 4), new aim("SensorLeftBorder", 5, 4), new aim("SensorBottomBorder", 6, 4), new aim("SensorRightBorder", 7, 4), new aim("ISO", 23, 3), new aim("JpgFromRaw", 46, 7), new aim("Xmp", 700, 1)};
    private static final aim[] x = {new aim("ExposureTime", 33434, 5), new aim("FNumber", 33437, 5), new aim("ExposureProgram", 34850, 3), new aim("SpectralSensitivity", 34852, 2), new aim("PhotographicSensitivity", 34855, 3), new aim("OECF", 34856, 7), new aim("SensitivityType", 34864, 3), new aim("StandardOutputSensitivity", 34865, 4), new aim("RecommendedExposureIndex", 34866, 4), new aim("ISOSpeed", 34867, 4), new aim("ISOSpeedLatitudeyyy", 34868, 4), new aim("ISOSpeedLatitudezzz", 34869, 4), new aim("ExifVersion", 36864, 2), new aim("DateTimeOriginal", 36867, 2), new aim("DateTimeDigitized", 36868, 2), new aim("OffsetTime", 36880, 2), new aim("OffsetTimeOriginal", 36881, 2), new aim("OffsetTimeDigitized", 36882, 2), new aim("ComponentsConfiguration", 37121, 7), new aim("CompressedBitsPerPixel", 37122, 5), new aim("ShutterSpeedValue", 37377, 10), new aim("ApertureValue", 37378, 5), new aim("BrightnessValue", 37379, 10), new aim("ExposureBiasValue", 37380, 10), new aim("MaxApertureValue", 37381, 5), new aim("SubjectDistance", 37382, 5), new aim("MeteringMode", 37383, 3), new aim("LightSource", 37384, 3), new aim("Flash", 37385, 3), new aim("FocalLength", 37386, 5), new aim("SubjectArea", 37396, 3), new aim("MakerNote", 37500, 7), new aim("UserComment", 37510, 7), new aim("SubSecTime", 37520, 2), new aim("SubSecTimeOriginal", 37521, 2), new aim("SubSecTimeDigitized", 37522, 2), new aim("FlashpixVersion", 40960, 7), new aim("ColorSpace", 40961, 3), new aim("PixelXDimension", 40962), new aim("PixelYDimension", 40963), new aim("RelatedSoundFile", 40964, 2), new aim("InteroperabilityIFDPointer", 40965, 4), new aim("FlashEnergy", 41483, 5), new aim("SpatialFrequencyResponse", 41484, 7), new aim("FocalPlaneXResolution", 41486, 5), new aim("FocalPlaneYResolution", 41487, 5), new aim("FocalPlaneResolutionUnit", 41488, 3), new aim("SubjectLocation", 41492, 3), new aim("ExposureIndex", 41493, 5), new aim("SensingMethod", 41495, 3), new aim("FileSource", 41728, 7), new aim("SceneType", 41729, 7), new aim("CFAPattern", 41730, 7), new aim("CustomRendered", 41985, 3), new aim("ExposureMode", 41986, 3), new aim("WhiteBalance", 41987, 3), new aim("DigitalZoomRatio", 41988, 5), new aim("FocalLengthIn35mmFilm", 41989, 3), new aim("SceneCaptureType", 41990, 3), new aim("GainControl", 41991, 3), new aim("Contrast", 41992, 3), new aim("Saturation", 41993, 3), new aim("Sharpness", 41994, 3), new aim("DeviceSettingDescription", 41995, 7), new aim("SubjectDistanceRange", 41996, 3), new aim("ImageUniqueID", 42016, 2), new aim("CameraOwnerName", 42032, 2), new aim("BodySerialNumber", 42033, 2), new aim("LensSpecification", 42034, 5), new aim("LensMake", 42035, 2), new aim("LensModel", 42036, 2), new aim("Gamma", 42240, 5), new aim("DNGVersion", 50706, 1), new aim("DefaultCropSize", 50720)};
    private static final aim[] y = {new aim("GPSVersionID", 0, 1), new aim("GPSLatitudeRef", 1, 2), new aim("GPSLatitude", 2, 5), new aim("GPSLongitudeRef", 3, 2), new aim("GPSLongitude", 4, 5), new aim("GPSAltitudeRef", 5, 1), new aim("GPSAltitude", 6, 5), new aim("GPSTimeStamp", 7, 5), new aim("GPSSatellites", 8, 2), new aim("GPSStatus", 9, 2), new aim("GPSMeasureMode", 10, 2), new aim("GPSDOP", 11, 5), new aim("GPSSpeedRef", 12, 2), new aim("GPSSpeed", 13, 5), new aim("GPSTrackRef", 14, 2), new aim("GPSTrack", 15, 5), new aim("GPSImgDirectionRef", 16, 2), new aim("GPSImgDirection", 17, 5), new aim("GPSMapDatum", 18, 2), new aim("GPSDestLatitudeRef", 19, 2), new aim("GPSDestLatitude", 20, 5), new aim("GPSDestLongitudeRef", 21, 2), new aim("GPSDestLongitude", 22, 5), new aim("GPSDestBearingRef", 23, 2), new aim("GPSDestBearing", 24, 5), new aim("GPSDestDistanceRef", 25, 2), new aim("GPSDestDistance", 26, 5), new aim("GPSProcessingMethod", 27, 7), new aim("GPSAreaInformation", 28, 7), new aim("GPSDateStamp", 29, 2), new aim("GPSDifferential", 30, 3), new aim("GPSHPositioningError", 31, 5)};
    private static final aim[] z = {new aim("InteroperabilityIndex", 1, 2)};
    private final String M;
    private final FileDescriptor N;
    private final AssetManager.AssetInputStream O;
    private int P;
    private final HashMap[] Q = new HashMap[10];
    private final Set R;
    private ByteOrder S;
    private boolean T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;

    static {
        Arrays.asList(new Integer[]{1, 6, 3, 8});
        Arrays.asList(new Integer[]{2, 7, 4, 5});
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        aim[] aimArr = {new aim("ColorSpace", 55, 3)};
        F = aimArr;
        aim[] aimArr2 = w;
        g = new aim[][]{aimArr2, x, y, z, A, aimArr2, C, D, E, aimArr};
        new aim("JPEGInterchangeFormat", 513, 4);
        new aim("JPEGInterchangeFormatLength", 514, 4);
        aim[][] aimArr3 = g;
        int length = aimArr3.length;
        int length2 = aimArr3.length;
        Charset forName = Charset.forName("US-ASCII");
        h = forName;
        i = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        v = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            int length3 = g.length;
            if (i2 < 10) {
                H[i2] = new HashMap();
                I[i2] = new HashMap();
                for (aim aim : g[i2]) {
                    H[i2].put(Integer.valueOf(aim.a), aim);
                    I[i2].put(aim.b, aim);
                }
                i2++;
            } else {
                K.put(Integer.valueOf(G[0].a), 5);
                K.put(Integer.valueOf(G[1].a), 1);
                K.put(Integer.valueOf(G[2].a), 2);
                K.put(Integer.valueOf(G[3].a), 3);
                K.put(Integer.valueOf(G[4].a), 7);
                K.put(Integer.valueOf(G[5].a), 8);
                return;
            }
        }
    }

    private static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i2])}));
        }
        return sb.toString();
    }

    private final ail b(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        int i2 = 0;
        while (true) {
            int length = g.length;
            if (i2 >= 10) {
                return null;
            }
            ail ail = (ail) this.Q[i2].get(str);
            if (ail != null) {
                return ail;
            }
            i2++;
        }
    }

    private final void c(aik aik) {
        aik.a = ByteOrder.LITTLE_ENDIAN;
        aik.skipBytes(s.length);
        int readInt = aik.readInt() + 8;
        int skipBytes = aik.skipBytes(t.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (aik.read(bArr) == 4) {
                    int readInt2 = aik.readInt();
                    int i2 = skipBytes + 8;
                    if (Arrays.equals(u, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (aik.read(bArr2) == readInt2) {
                            this.U = i2;
                            a(bArr2, 0);
                            this.U = i2;
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + a(bArr));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    int i3 = i2 + readInt2;
                    if (i3 == readInt) {
                        return;
                    }
                    if (i3 <= readInt) {
                        int skipBytes2 = aik.skipBytes(readInt2);
                        if (skipBytes2 == readInt2) {
                            skipBytes = i2 + skipBytes2;
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static final ByteOrder d(aik aik) {
        short readShort = aik.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    public aio(InputStream inputStream) {
        int length = g.length;
        int length2 = g.length;
        this.R = new HashSet(10);
        this.S = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            FileDescriptor fileDescriptor = null;
            this.M = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.O = (AssetManager.AssetInputStream) inputStream;
                this.N = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (a(fileInputStream.getFD())) {
                        this.O = null;
                        fileDescriptor = fileInputStream.getFD();
                        this.N = fileDescriptor;
                    }
                }
                this.O = null;
                this.N = fileDescriptor;
            }
            a(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    private final void b() {
        a(0, 5);
        a(0, 4);
        a(5, 4);
        ail ail = (ail) this.Q[1].get("PixelXDimension");
        ail ail2 = (ail) this.Q[1].get("PixelYDimension");
        if (!(ail == null || ail2 == null)) {
            this.Q[0].put("ImageWidth", ail);
            this.Q[0].put("ImageLength", ail2);
        }
        if (this.Q[4].isEmpty() && a(this.Q[5])) {
            HashMap[] hashMapArr = this.Q;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        boolean a2 = a(this.Q[4]);
    }

    private final void a() {
        String a2 = a("DateTimeOriginal");
        if (a2 != null && a("DateTime") == null) {
            this.Q[0].put("DateTime", ail.a(a2));
        }
        if (a("ImageWidth") == null) {
            this.Q[0].put("ImageWidth", ail.a(0, this.S));
        }
        if (a("ImageLength") == null) {
            this.Q[0].put("ImageLength", ail.a(0, this.S));
        }
        if (a("Orientation") == null) {
            this.Q[0].put("Orientation", ail.a(0, this.S));
        }
        if (a("LightSource") == null) {
            this.Q[1].put("LightSource", ail.a(0, this.S));
        }
    }

    private final void b(aik aik) {
        aik.a = ByteOrder.BIG_ENDIAN;
        aik.skipBytes(o.length);
        int length = o.length;
        while (true) {
            try {
                int readInt = aik.readInt();
                byte[] bArr = new byte[4];
                if (aik.read(bArr) == 4) {
                    int i2 = length + 8;
                    if (i2 == 16) {
                        if (!Arrays.equals(bArr, q)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (Arrays.equals(bArr, r)) {
                        return;
                    }
                    if (Arrays.equals(bArr, p)) {
                        byte[] bArr2 = new byte[readInt];
                        if (aik.read(bArr2) == readInt) {
                            int readInt2 = aik.readInt();
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArr);
                            crc32.update(bArr2);
                            if (((int) crc32.getValue()) == readInt2) {
                                this.U = i2;
                                a(bArr2, 0);
                                b();
                                return;
                            }
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + a(bArr));
                    }
                    int i3 = readInt + 4;
                    aik.skipBytes(i3);
                    length = i2 + i3;
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private final void a(int i2, int i3) {
        if (!this.Q[i2].isEmpty() && !this.Q[i3].isEmpty()) {
            ail ail = (ail) this.Q[i2].get("ImageLength");
            ail ail2 = (ail) this.Q[i2].get("ImageWidth");
            ail ail3 = (ail) this.Q[i3].get("ImageLength");
            ail ail4 = (ail) this.Q[i3].get("ImageWidth");
            if (ail != null && ail2 != null && ail3 != null && ail4 != null) {
                int b2 = ail.b(this.S);
                int b3 = ail2.b(this.S);
                int b4 = ail3.b(this.S);
                int b5 = ail4.b(this.S);
                if (b2 < b4 && b3 < b5) {
                    HashMap[] hashMapArr = this.Q;
                    HashMap hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                }
            }
        }
    }

    public aio(String str) {
        int length = g.length;
        int length2 = g.length;
        this.R = new HashSet(10);
        this.S = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.O = null;
            this.M = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    if (a(fileInputStream2.getFD())) {
                        this.N = fileInputStream2.getFD();
                    } else {
                        this.N = null;
                    }
                    a((InputStream) fileInputStream2);
                    a((Closeable) fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                a((Closeable) fileInputStream);
                throw th;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    private final void a(aik aik) {
        ail ail;
        a(aik, aik.available());
        b(aik, 0);
        c(aik, 0);
        c(aik, 5);
        c(aik, 4);
        b();
        if (this.P == 8 && (ail = (ail) this.Q[1].get("MakerNote")) != null) {
            aik aik2 = new aik(ail.c);
            aik2.a = this.S;
            aik2.a(6);
            b(aik2, 9);
            ail ail2 = (ail) this.Q[9].get("ColorSpace");
            if (ail2 != null) {
                this.Q[1].put("ColorSpace", ail2);
            }
        }
    }

    private final void c(aik aik, int i2) {
        ail ail;
        ail ail2;
        ail ail3;
        ail ail4 = (ail) this.Q[i2].get("DefaultCropSize");
        ail ail5 = (ail) this.Q[i2].get("SensorTopBorder");
        ail ail6 = (ail) this.Q[i2].get("SensorLeftBorder");
        ail ail7 = (ail) this.Q[i2].get("SensorBottomBorder");
        ail ail8 = (ail) this.Q[i2].get("SensorRightBorder");
        if (ail4 != null) {
            if (ail4.a == 5) {
                ain[] ainArr = (ain[]) ail4.a(this.S);
                if (ainArr != null && ainArr.length == 2) {
                    ail3 = ail.a(ainArr[0], this.S);
                    ail2 = ail.a(ainArr[1], this.S);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(ainArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) ail4.a(this.S);
                if (iArr != null && iArr.length == 2) {
                    ail3 = ail.a(iArr[0], this.S);
                    ail2 = ail.a(iArr[1], this.S);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            this.Q[i2].put("ImageWidth", ail3);
            this.Q[i2].put("ImageLength", ail2);
        } else if (ail5 == null || ail6 == null || ail7 == null || ail8 == null) {
            ail ail9 = (ail) this.Q[i2].get("ImageLength");
            ail ail10 = (ail) this.Q[i2].get("ImageWidth");
            if ((ail9 == null || ail10 == null) && (ail = (ail) this.Q[i2].get("JPEGInterchangeFormat")) != null) {
                a(aik, ail.b(this.S), i2);
            }
        } else {
            int b2 = ail5.b(this.S);
            int b3 = ail7.b(this.S);
            int b4 = ail8.b(this.S);
            int b5 = ail6.b(this.S);
            if (b3 > b2 && b4 > b5) {
                ail a2 = ail.a(b3 - b2, this.S);
                ail a3 = ail.a(b4 - b5, this.S);
                this.Q[i2].put("ImageLength", a2);
                this.Q[i2].put("ImageWidth", a3);
            }
        }
    }

    private final void a(aik aik, int i2) {
        ByteOrder d2 = d(aik);
        this.S = d2;
        aik.a = d2;
        int readUnsignedShort = aik.readUnsignedShort();
        int i3 = this.P;
        if (i3 == 7 || i3 == 10 || readUnsignedShort == 42) {
            int readInt = aik.readInt();
            if (readInt < 8 || readInt >= i2) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i4 = readInt - 8;
            if (i4 > 0 && aik.skipBytes(i4) != i4) {
                throw new IOException("Couldn't jump to first Ifd: " + i4);
            }
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    private final void b(aik aik, int i2) {
        boolean z2;
        long j2;
        short s2;
        short s3;
        int i3;
        int i4;
        Integer num;
        String str;
        long j3;
        int i5;
        int i6;
        aik aik2 = aik;
        int i7 = i2;
        this.R.add(Integer.valueOf(aik2.c));
        if (aik2.c + 2 <= aik2.b) {
            short readShort = aik.readShort();
            if (aik2.c + (readShort * 12) <= aik2.b && readShort > 0) {
                short s4 = 0;
                while (s4 < readShort) {
                    int readUnsignedShort = aik.readUnsignedShort();
                    int readUnsignedShort2 = aik.readUnsignedShort();
                    int readInt = aik.readInt();
                    long j4 = ((long) aik2.c) + 4;
                    HashMap hashMap = H[i7];
                    Integer valueOf = Integer.valueOf(readUnsignedShort);
                    aim aim = (aim) hashMap.get(valueOf);
                    if (aim == null) {
                        j2 = 0;
                        z2 = false;
                    } else if (readUnsignedShort2 <= 0) {
                        j2 = 0;
                        z2 = false;
                    } else if (readUnsignedShort2 < e.length && ((i5 = aim.c) == 7 || readUnsignedShort2 == 7 || i5 == readUnsignedShort2 || (i6 = aim.d) == readUnsignedShort2 || (((i5 == 4 || i6 == 4) && readUnsignedShort2 == 3) || (i5 == 9 && readUnsignedShort2 == 8)))) {
                        if (readUnsignedShort2 == 7) {
                            readUnsignedShort2 = i5;
                        }
                        j2 = ((long) e[readUnsignedShort2]) * ((long) readInt);
                        z2 = j2 >= 0 && j2 <= 2147483647L;
                    } else {
                        j2 = 0;
                        z2 = false;
                    }
                    if (z2) {
                        if (j2 > 4) {
                            int readInt2 = aik.readInt();
                            int i8 = this.P;
                            s3 = readShort;
                            if (i8 != 7) {
                                s2 = s4;
                                i3 = readUnsignedShort2;
                                i4 = readInt;
                                num = valueOf;
                                if (i8 == 10 && "JpgFromRaw".equals(aim.b)) {
                                    this.Y = readInt2;
                                }
                            } else if ("MakerNote".equals(aim.b)) {
                                s2 = s4;
                                i3 = readUnsignedShort2;
                                i4 = readInt;
                                num = valueOf;
                                this.V = readInt2;
                            } else if (i7 != 6) {
                                s2 = s4;
                                i3 = readUnsignedShort2;
                                i4 = readInt;
                                num = valueOf;
                            } else if ("ThumbnailImage".equals(aim.b)) {
                                this.W = readInt2;
                                this.X = readInt;
                                ail a2 = ail.a(6, this.S);
                                s2 = s4;
                                i3 = readUnsignedShort2;
                                i4 = readInt;
                                ail a3 = ail.a((long) this.W, this.S);
                                num = valueOf;
                                ail a4 = ail.a((long) this.X, this.S);
                                this.Q[4].put("Compression", a2);
                                this.Q[4].put("JPEGInterchangeFormat", a3);
                                this.Q[4].put("JPEGInterchangeFormatLength", a4);
                            } else {
                                s2 = s4;
                                i3 = readUnsignedShort2;
                                i4 = readInt;
                                num = valueOf;
                            }
                            long j5 = (long) readInt2;
                            str = "Compression";
                            if (j5 + j2 <= ((long) aik2.b)) {
                                aik2.a(j5);
                            } else {
                                aik2.a(j4);
                            }
                        } else {
                            s3 = readShort;
                            s2 = s4;
                            i3 = readUnsignedShort2;
                            i4 = readInt;
                            str = "Compression";
                            num = valueOf;
                        }
                        Integer num2 = (Integer) K.get(num);
                        if (num2 == null) {
                            byte[] bArr = new byte[((int) j2)];
                            aik2.readFully(bArr);
                            ail ail = new ail(i3, i4, bArr, (byte[]) null);
                            this.Q[i7].put(aim.b, ail);
                            if ("DNGVersion".equals(aim.b)) {
                                this.P = 3;
                            }
                            if ((("Make".equals(aim.b) || "Model".equals(aim.b)) && ail.c(this.S).contains("PENTAX")) || (str.equals(aim.b) && ail.b(this.S) == 65535)) {
                                this.P = 8;
                            }
                            if (((long) aik2.c) != j4) {
                                aik2.a(j4);
                            }
                        } else {
                            int i9 = i3;
                            if (i9 == 3) {
                                j3 = (long) aik.readUnsignedShort();
                            } else if (i9 == 4) {
                                j3 = aik.a();
                            } else if (i9 == 8) {
                                j3 = (long) aik.readShort();
                            } else if (i9 == 9 || i9 == 13) {
                                j3 = (long) aik.readInt();
                            } else {
                                j3 = -1;
                            }
                            if (j3 > 0 && j3 < ((long) aik2.b) && !this.R.contains(Integer.valueOf((int) j3))) {
                                aik2.a(j3);
                                b(aik2, num2.intValue());
                            }
                            aik2.a(j4);
                        }
                    } else {
                        s3 = readShort;
                        s2 = s4;
                        aik2.a(j4);
                    }
                    s4 = (short) (s2 + 1);
                    readShort = s3;
                }
                if (aik2.c + 4 <= aik2.b) {
                    int readInt3 = aik.readInt();
                    long j6 = (long) readInt3;
                    if (j6 > 0 && readInt3 < aik2.b && !this.R.contains(Integer.valueOf(readInt3))) {
                        aik2.a(j6);
                        if (this.Q[4].isEmpty()) {
                            b(aik2, 4);
                        } else if (this.Q[5].isEmpty()) {
                            b(aik2, 5);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0086 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.aik r12, int r13, int r14) {
        /*
            r11 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r12.a = r0
            long r0 = (long) r13
            r12.a(r0)
            byte r0 = r12.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            r3 = 255(0xff, float:3.57E-43)
            if (r0 != r2) goto L_0x0160
            byte r0 = r12.readByte()
            r4 = -40
            if (r0 != r4) goto L_0x0147
            int r13 = r13 + 2
        L_0x001d:
            byte r0 = r12.readByte()
            if (r0 != r2) goto L_0x012a
            byte r0 = r12.readByte()
            r1 = -39
            if (r0 != r1) goto L_0x002d
        L_0x002b:
            goto L_0x0125
        L_0x002d:
            r1 = -38
            if (r0 == r1) goto L_0x002b
            int r1 = r12.readUnsignedShort()
            r4 = -2
            int r1 = r1 + r4
            int r13 = r13 + 4
            java.lang.String r5 = "Invalid length"
            if (r1 < 0) goto L_0x011f
            r6 = -31
            r7 = 1
            r8 = 0
            if (r0 == r6) goto L_0x00bc
            if (r0 == r4) goto L_0x008e
            switch(r0) {
                case -64: goto L_0x0053;
                case -63: goto L_0x0053;
                case -62: goto L_0x0053;
                case -61: goto L_0x0053;
                default: goto L_0x0048;
            }
        L_0x0048:
            switch(r0) {
                case -59: goto L_0x0053;
                case -58: goto L_0x0053;
                case -57: goto L_0x0053;
                default: goto L_0x004b;
            }
        L_0x004b:
            switch(r0) {
                case -55: goto L_0x0053;
                case -54: goto L_0x0053;
                case -53: goto L_0x0053;
                default: goto L_0x004e;
            }
        L_0x004e:
            switch(r0) {
                case -51: goto L_0x0053;
                case -50: goto L_0x0053;
                case -49: goto L_0x0053;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x0106
        L_0x0053:
            int r0 = r12.skipBytes(r7)
            if (r0 != r7) goto L_0x0086
            java.util.HashMap[] r0 = r11.Q
            r0 = r0[r14]
            int r4 = r12.readUnsignedShort()
            long r6 = (long) r4
            java.nio.ByteOrder r4 = r11.S
            ail r4 = defpackage.ail.a((long) r6, (java.nio.ByteOrder) r4)
            java.lang.String r6 = "ImageLength"
            r0.put(r6, r4)
            java.util.HashMap[] r0 = r11.Q
            r0 = r0[r14]
            int r4 = r12.readUnsignedShort()
            long r6 = (long) r4
            java.nio.ByteOrder r4 = r11.S
            ail r4 = defpackage.ail.a((long) r6, (java.nio.ByteOrder) r4)
            java.lang.String r6 = "ImageWidth"
            r0.put(r6, r4)
            int r1 = r1 + -5
            goto L_0x0106
        L_0x0086:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "Invalid SOFx"
            r12.<init>(r13)
            throw r12
        L_0x008e:
            byte[] r0 = new byte[r1]
            int r4 = r12.read(r0)
            if (r4 != r1) goto L_0x00b4
            java.lang.String r1 = "UserComment"
            java.lang.String r4 = r11.a((java.lang.String) r1)
            if (r4 != 0) goto L_0x00b1
            java.util.HashMap[] r4 = r11.Q
            r4 = r4[r7]
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r7 = h
            r6.<init>(r0, r7)
            ail r0 = defpackage.ail.a((java.lang.String) r6)
            r4.put(r1, r0)
            goto L_0x00b2
        L_0x00b1:
        L_0x00b2:
            r1 = 0
            goto L_0x0106
        L_0x00b4:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "Invalid exif"
            r12.<init>(r13)
            throw r12
        L_0x00bc:
            byte[] r0 = new byte[r1]
            r12.readFully(r0)
            int r4 = r13 + r1
            byte[] r6 = i
            boolean r6 = a((byte[]) r0, (byte[]) r6)
            if (r6 == 0) goto L_0x00dc
            byte[] r6 = i
            int r7 = r6.length
            int r6 = r6.length
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r6, r1)
            int r13 = r13 + r7
            r11.U = r13
            r11.a((byte[]) r0, (int) r14)
            r13 = r4
            r1 = 0
            goto L_0x0106
        L_0x00dc:
            byte[] r13 = L
            boolean r13 = a((byte[]) r0, (byte[]) r13)
            if (r13 == 0) goto L_0x0103
            byte[] r13 = L
            int r6 = r13.length
            int r13 = r13.length
            byte[] r13 = java.util.Arrays.copyOfRange(r0, r13, r1)
            java.lang.String r0 = "Xmp"
            java.lang.String r1 = r11.a((java.lang.String) r0)
            if (r1 != 0) goto L_0x0103
            java.util.HashMap[] r1 = r11.Q
            r1 = r1[r8]
            ail r6 = new ail
            int r9 = r13.length
            r10 = 0
            r6.<init>(r7, r9, r13, r10)
            r1.put(r0, r6)
            goto L_0x0104
        L_0x0103:
        L_0x0104:
            r13 = r4
            r1 = 0
        L_0x0106:
            if (r1 < 0) goto L_0x0119
            int r0 = r12.skipBytes(r1)
            if (r0 != r1) goto L_0x0111
            int r13 = r13 + r1
            goto L_0x001d
        L_0x0111:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "Invalid JPEG segment"
            r12.<init>(r13)
            throw r12
        L_0x0119:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r5)
            throw r12
        L_0x011f:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r5)
            throw r12
        L_0x0125:
            java.nio.ByteOrder r13 = r11.S
            r12.a = r13
            return
        L_0x012a:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Invalid marker:"
            r13.append(r14)
            r14 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r14 = java.lang.Integer.toHexString(r14)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x0147:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            java.lang.String r14 = java.lang.Integer.toHexString(r3)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x0160:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r1)
            r14 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r14 = java.lang.Integer.toHexString(r14)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            goto L_0x017c
        L_0x017b:
            throw r12
        L_0x017c:
            goto L_0x017b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aio.a(aik, int, int):void");
    }

    private final void a(aik aik, HashMap hashMap) {
        ail ail = (ail) hashMap.get("JPEGInterchangeFormat");
        ail ail2 = (ail) hashMap.get("JPEGInterchangeFormatLength");
        if (ail != null && ail2 != null) {
            int b2 = ail.b(this.S);
            int b3 = ail2.b(this.S);
            if (this.P == 7) {
                b2 += this.V;
            }
            int min = Math.min(b3, aik.b - b2);
            if (b2 > 0 && min > 0) {
                int i2 = b2 + this.U;
                if (this.M == null && this.O == null && this.N == null) {
                    aik.a((long) i2);
                    aik.readFully(new byte[min]);
                }
            }
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0142, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0143, code lost:
        r2 = r0;
        r15 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0148, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0149, code lost:
        r2 = r0;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x014b, code lost:
        if (r15 != null) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x014d, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0150, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        r8 = "FUJIFILMCCD-RAW".getBytes(java.nio.charset.Charset.defaultCharset());
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0152, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0153, code lost:
        if (r8 == null) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0155, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0158, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x015a, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x015e, code lost:
        if (r8 < o.length) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0166, code lost:
        if (r7[r8] == o[r8]) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0168, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x016b, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x016f, code lost:
        if (r8 < s.length) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0177, code lost:
        if (r7[r8] == s[r8]) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0179, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x017c, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x017e, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0182, code lost:
        if (r8 < t.length) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r9 >= r8.length) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x018f, code lost:
        if (r7[(s.length + r8) + 4] == t[r8]) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0191, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0194, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0196, code lost:
        r7 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0199, code lost:
        r7 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x019c, code lost:
        r7 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r7[r9] != r8[r9]) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r8 = new defpackage.aik(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r12 = (long) r8.readInt();
        r9 = new byte[4];
        r8.read(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (java.util.Arrays.equals(r9, j) == false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r18 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (r12 != 1) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        r12 = r8.readLong();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (r12 < 16) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        r18 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        if (r12 <= 5000) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        r12 = 5000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        r12 = r12 - r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
        if (r12 < 8) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        r9 = new byte[4];
        r14 = false;
        r17 = false;
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        if (r18 >= (r12 / 4)) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
        if (r8.read(r9) != 4) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        if (r18 == 1) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b0, code lost:
        if (java.util.Arrays.equals(r9, k) != false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b8, code lost:
        if (java.util.Arrays.equals(r9, l) == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ba, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bd, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bf, code lost:
        if (r17 != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c2, code lost:
        if (r14 != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r8.close();
        r7 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cd, code lost:
        r18 = r18 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d2, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d7, code lost:
        r2 = r0;
        r15 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dd, code lost:
        r2 = r0;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00df, code lost:
        if (r15 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e1, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e4, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e6, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e7, code lost:
        if (r8 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r8 = new defpackage.aik(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r9 = d(r8);
        r1.S = r9;
        r8.a = r9;
        r9 = r8.readShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00fd, code lost:
        if (r9 == 20306) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0101, code lost:
        if (r9 == 21330) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0103, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0105, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0109, code lost:
        if (r9 != false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x010c, code lost:
        r7 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x010f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0110, code lost:
        r2 = r0;
        r15 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0115, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0116, code lost:
        r2 = r0;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0118, code lost:
        if (r15 != null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x011a, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x011d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x011f, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0120, code lost:
        if (r8 != null) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0122, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r8 = new defpackage.aik(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r9 = d(r8);
        r1.S = r9;
        r8.a = r9;
        r9 = r8.readShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x013b, code lost:
        if (r9 == 85) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x013e, code lost:
        r7 = 10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x014d A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0155 A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x015a A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0160 A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01ba A[SYNTHETIC, Splitter:B:142:0x01ba] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01bf A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01c4 A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x020a A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x021d A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x023c A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x024f A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0262 A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x028b A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x028d A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x02e5 A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0321 A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x038e A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0482 A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0487 A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0499 A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x058d A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0199 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e1 A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011a A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0122 A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x013d A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x013e A[Catch:{ all -> 0x02df, IOException -> 0x059a, all -> 0x0594 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.io.InputStream r26) {
        /*
            r25 = this;
            r1 = r25
            java.lang.String r2 = "PhotographicSensitivity"
            java.lang.String r3 = "yes"
            r4 = 0
            r5 = 0
        L_0x0008:
            aim[][] r6 = g     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r6 = r6.length     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r6 = 10
            if (r5 >= r6) goto L_0x001b
            java.util.HashMap[] r6 = r1.Q     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r7.<init>()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r6[r5] = r7     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r5 = r5 + 1
            goto L_0x0008
        L_0x001b:
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r7 = 5000(0x1388, float:7.006E-42)
            r8 = r26
            r5.<init>(r8, r7)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r5.mark(r7)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte[] r7 = new byte[r7]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r5.read(r7)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r5.reset()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r8 = 0
        L_0x0030:
            byte[] r9 = c     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r9 = r9.length     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r10 = 8
            r6 = 4
            if (r8 >= r9) goto L_0x01a5
            byte r9 = r7[r8]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte[] r17 = c     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte r14 = r17[r8]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r9 == r14) goto L_0x019f
            java.lang.String r8 = "FUJIFILMCCD-RAW"
            java.nio.charset.Charset r9 = java.nio.charset.Charset.defaultCharset()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte[] r8 = r8.getBytes(r9)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r9 = 0
        L_0x004b:
            int r14 = r8.length     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r9 >= r14) goto L_0x019c
            byte r14 = r7[r9]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte r12 = r8[r9]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r14 != r12) goto L_0x0057
            int r9 = r9 + 1
            goto L_0x004b
        L_0x0057:
            aik r8 = new aik     // Catch:{ Exception -> 0x00e5, all -> 0x00dc }
            r8.<init>((byte[]) r7)     // Catch:{ Exception -> 0x00e5, all -> 0x00dc }
            int r9 = r8.readInt()     // Catch:{ Exception -> 0x00da, all -> 0x00d6 }
            long r12 = (long) r9     // Catch:{ Exception -> 0x00da, all -> 0x00d6 }
            byte[] r9 = new byte[r6]     // Catch:{ Exception -> 0x00da, all -> 0x00d6 }
            r8.read(r9)     // Catch:{ Exception -> 0x00da, all -> 0x00d6 }
            byte[] r14 = j     // Catch:{ Exception -> 0x00da, all -> 0x00d6 }
            boolean r9 = java.util.Arrays.equals(r9, r14)     // Catch:{ Exception -> 0x00da, all -> 0x00d6 }
            if (r9 == 0) goto L_0x00d2
            r18 = 16
            r20 = 1
            int r9 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r9 != 0) goto L_0x007f
            long r12 = r8.readLong()     // Catch:{ Exception -> 0x00da, all -> 0x00d6 }
            int r9 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r9 < 0) goto L_0x00d2
            goto L_0x0081
        L_0x007f:
            r18 = r10
        L_0x0081:
            r22 = 5000(0x1388, double:2.4703E-320)
            int r9 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r9 <= 0) goto L_0x008a
            r12 = r22
            goto L_0x008b
        L_0x008a:
        L_0x008b:
            long r12 = r12 - r18
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 < 0) goto L_0x00d2
            byte[] r9 = new byte[r6]     // Catch:{ Exception -> 0x00da, all -> 0x00d6 }
            r14 = 0
            r17 = 0
            r18 = 0
        L_0x0098:
            r22 = 4
            long r22 = r12 / r22
            int r24 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r24 >= 0) goto L_0x00d2
            int r10 = r8.read(r9)     // Catch:{ Exception -> 0x00da, all -> 0x00d6 }
            if (r10 != r6) goto L_0x00d2
            int r10 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r10 == 0) goto L_0x00cc
            byte[] r10 = k     // Catch:{ Exception -> 0x00da, all -> 0x00d6 }
            boolean r10 = java.util.Arrays.equals(r9, r10)     // Catch:{ Exception -> 0x00da, all -> 0x00d6 }
            if (r10 != 0) goto L_0x00bd
            byte[] r10 = l     // Catch:{ Exception -> 0x00da, all -> 0x00d6 }
            boolean r10 = java.util.Arrays.equals(r9, r10)     // Catch:{ Exception -> 0x00da, all -> 0x00d6 }
            if (r10 == 0) goto L_0x00bc
            r14 = 1
            goto L_0x00bf
        L_0x00bc:
            goto L_0x00bf
        L_0x00bd:
            r17 = 1
        L_0x00bf:
            if (r17 != 0) goto L_0x00c2
        L_0x00c1:
            goto L_0x00cd
        L_0x00c2:
            if (r14 != 0) goto L_0x00c5
            goto L_0x00c1
        L_0x00c5:
            r8.close()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r7 = 12
            goto L_0x01a6
        L_0x00cc:
        L_0x00cd:
            long r18 = r18 + r20
            r10 = 8
            goto L_0x0098
        L_0x00d2:
            r8.close()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            goto L_0x00ea
        L_0x00d6:
            r0 = move-exception
            r2 = r0
            r15 = r8
            goto L_0x00df
        L_0x00da:
            r0 = move-exception
            goto L_0x00e7
        L_0x00dc:
            r0 = move-exception
            r2 = r0
            r15 = 0
        L_0x00df:
            if (r15 == 0) goto L_0x00e4
            r15.close()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
        L_0x00e4:
            throw r2     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
        L_0x00e5:
            r0 = move-exception
            r8 = 0
        L_0x00e7:
            if (r8 == 0) goto L_0x00ea
            goto L_0x00d2
        L_0x00ea:
            aik r8 = new aik     // Catch:{ Exception -> 0x011e, all -> 0x0115 }
            r8.<init>((byte[]) r7)     // Catch:{ Exception -> 0x011e, all -> 0x0115 }
            java.nio.ByteOrder r9 = d(r8)     // Catch:{ Exception -> 0x0113, all -> 0x010f }
            r1.S = r9     // Catch:{ Exception -> 0x0113, all -> 0x010f }
            r8.a = r9     // Catch:{ Exception -> 0x0113, all -> 0x010f }
            short r9 = r8.readShort()     // Catch:{ Exception -> 0x0113, all -> 0x010f }
            r10 = 20306(0x4f52, float:2.8455E-41)
            if (r9 == r10) goto L_0x0105
            r10 = 21330(0x5352, float:2.989E-41)
            if (r9 == r10) goto L_0x0105
            r9 = 0
            goto L_0x0106
        L_0x0105:
            r9 = 1
        L_0x0106:
            r8.close()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r9 != 0) goto L_0x010c
            goto L_0x0125
        L_0x010c:
            r7 = 7
            goto L_0x01a6
        L_0x010f:
            r0 = move-exception
            r2 = r0
            r15 = r8
            goto L_0x0118
        L_0x0113:
            r0 = move-exception
            goto L_0x0120
        L_0x0115:
            r0 = move-exception
            r2 = r0
            r15 = 0
        L_0x0118:
            if (r15 == 0) goto L_0x011d
            r15.close()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
        L_0x011d:
            throw r2     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
        L_0x011e:
            r0 = move-exception
            r8 = 0
        L_0x0120:
            if (r8 == 0) goto L_0x0125
            r8.close()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
        L_0x0125:
            aik r8 = new aik     // Catch:{ Exception -> 0x0151, all -> 0x0148 }
            r8.<init>((byte[]) r7)     // Catch:{ Exception -> 0x0151, all -> 0x0148 }
            java.nio.ByteOrder r9 = d(r8)     // Catch:{ Exception -> 0x0146, all -> 0x0142 }
            r1.S = r9     // Catch:{ Exception -> 0x0146, all -> 0x0142 }
            r8.a = r9     // Catch:{ Exception -> 0x0146, all -> 0x0142 }
            short r9 = r8.readShort()     // Catch:{ Exception -> 0x0146, all -> 0x0142 }
            r8.close()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r8 = 85
            if (r9 == r8) goto L_0x013e
            goto L_0x0158
        L_0x013e:
            r7 = 10
            goto L_0x01a6
        L_0x0142:
            r0 = move-exception
            r2 = r0
            r15 = r8
            goto L_0x014b
        L_0x0146:
            r0 = move-exception
            goto L_0x0153
        L_0x0148:
            r0 = move-exception
            r2 = r0
            r15 = 0
        L_0x014b:
            if (r15 == 0) goto L_0x0150
            r15.close()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
        L_0x0150:
            throw r2     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
        L_0x0151:
            r0 = move-exception
            r8 = 0
        L_0x0153:
            if (r8 == 0) goto L_0x015a
            r8.close()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
        L_0x0158:
            r8 = 0
            goto L_0x015b
        L_0x015a:
            r8 = 0
        L_0x015b:
            byte[] r9 = o     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r9 = r9.length     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r8 >= r9) goto L_0x0199
            byte r9 = r7[r8]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte[] r10 = o     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte r10 = r10[r8]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r9 != r10) goto L_0x016b
            int r8 = r8 + 1
            goto L_0x015b
        L_0x016b:
            r8 = 0
        L_0x016c:
            byte[] r9 = s     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r9 = r9.length     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r8 >= r9) goto L_0x017e
            byte r9 = r7[r8]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte[] r10 = s     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte r10 = r10[r8]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r9 != r10) goto L_0x017c
            int r8 = r8 + 1
            goto L_0x016c
        L_0x017c:
            r7 = 0
            goto L_0x01a6
        L_0x017e:
            r8 = 0
        L_0x017f:
            byte[] r9 = t     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r9 = r9.length     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r8 >= r9) goto L_0x0196
            byte[] r9 = s     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r9 = r9.length     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r9 = r9 + r8
            int r9 = r9 + r6
            byte r9 = r7[r9]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte[] r10 = t     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte r10 = r10[r8]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r9 != r10) goto L_0x0194
            int r8 = r8 + 1
            goto L_0x017f
        L_0x0194:
            r7 = 0
            goto L_0x01a6
        L_0x0196:
            r7 = 14
            goto L_0x01a6
        L_0x0199:
            r7 = 13
            goto L_0x01a6
        L_0x019c:
            r7 = 9
            goto L_0x01a6
        L_0x019f:
            int r8 = r8 + 1
            r6 = 10
            goto L_0x0030
        L_0x01a5:
            r7 = 4
        L_0x01a6:
            r1.P = r7     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            aik r7 = new aik     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r7.<init>((java.io.InputStream) r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r5 = r1.P     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.String r9 = "ImageLength"
            java.lang.String r11 = "ImageWidth"
            java.lang.String r12 = "ExifInterface"
            r13 = 5
            r14 = 6
            switch(r5) {
                case 0: goto L_0x0487;
                case 1: goto L_0x0487;
                case 2: goto L_0x0487;
                case 3: goto L_0x0487;
                case 4: goto L_0x0482;
                case 5: goto L_0x0487;
                case 6: goto L_0x0487;
                case 7: goto L_0x038e;
                case 8: goto L_0x0487;
                case 9: goto L_0x0321;
                case 10: goto L_0x02e5;
                case 11: goto L_0x0487;
                case 12: goto L_0x01c4;
                case 13: goto L_0x01bf;
                default: goto L_0x01ba;
            }
        L_0x01ba:
            r1.c(r7)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            goto L_0x048a
        L_0x01bf:
            r1.b((defpackage.aik) r7)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            goto L_0x048a
        L_0x01c4:
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r2.<init>()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x02df }
            r13 = 23
            if (r5 < r13) goto L_0x01d8
            aij r5 = new aij     // Catch:{ all -> 0x02df }
            r5.<init>(r7)     // Catch:{ all -> 0x02df }
            r2.setDataSource(r5)     // Catch:{ all -> 0x02df }
            goto L_0x01ec
        L_0x01d8:
            java.io.FileDescriptor r5 = r1.N     // Catch:{ all -> 0x02df }
            if (r5 != 0) goto L_0x01e9
            java.lang.String r5 = r1.M     // Catch:{ all -> 0x02df }
            if (r5 == 0) goto L_0x01e4
            r2.setDataSource(r5)     // Catch:{ all -> 0x02df }
            goto L_0x01ec
        L_0x01e4:
            r2.release()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            goto L_0x048a
        L_0x01e9:
            r2.setDataSource(r5)     // Catch:{ all -> 0x02df }
        L_0x01ec:
            r5 = 33
            java.lang.String r5 = r2.extractMetadata(r5)     // Catch:{ all -> 0x02df }
            r13 = 34
            java.lang.String r13 = r2.extractMetadata(r13)     // Catch:{ all -> 0x02df }
            r10 = 26
            java.lang.String r10 = r2.extractMetadata(r10)     // Catch:{ all -> 0x02df }
            r8 = 17
            java.lang.String r8 = r2.extractMetadata(r8)     // Catch:{ all -> 0x02df }
            boolean r10 = r3.equals(r10)     // Catch:{ all -> 0x02df }
            if (r10 == 0) goto L_0x021d
            r3 = 29
            java.lang.String r3 = r2.extractMetadata(r3)     // Catch:{ all -> 0x02df }
            r8 = 30
            java.lang.String r8 = r2.extractMetadata(r8)     // Catch:{ all -> 0x02df }
            r10 = 31
            java.lang.String r10 = r2.extractMetadata(r10)     // Catch:{ all -> 0x02df }
            goto L_0x023a
        L_0x021d:
            boolean r3 = r3.equals(r8)     // Catch:{ all -> 0x02df }
            if (r3 == 0) goto L_0x0237
            r3 = 18
            java.lang.String r3 = r2.extractMetadata(r3)     // Catch:{ all -> 0x02df }
            r8 = 19
            java.lang.String r8 = r2.extractMetadata(r8)     // Catch:{ all -> 0x02df }
            r10 = 24
            java.lang.String r10 = r2.extractMetadata(r10)     // Catch:{ all -> 0x02df }
            goto L_0x023a
        L_0x0237:
            r3 = 0
            r8 = 0
            r10 = 0
        L_0x023a:
            if (r3 == 0) goto L_0x024d
            java.util.HashMap[] r6 = r1.Q     // Catch:{ all -> 0x02df }
            r6 = r6[r4]     // Catch:{ all -> 0x02df }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ all -> 0x02df }
            java.nio.ByteOrder r15 = r1.S     // Catch:{ all -> 0x02df }
            ail r3 = defpackage.ail.a((int) r3, (java.nio.ByteOrder) r15)     // Catch:{ all -> 0x02df }
            r6.put(r11, r3)     // Catch:{ all -> 0x02df }
        L_0x024d:
            if (r8 == 0) goto L_0x0260
            java.util.HashMap[] r3 = r1.Q     // Catch:{ all -> 0x02df }
            r3 = r3[r4]     // Catch:{ all -> 0x02df }
            int r6 = java.lang.Integer.parseInt(r8)     // Catch:{ all -> 0x02df }
            java.nio.ByteOrder r8 = r1.S     // Catch:{ all -> 0x02df }
            ail r6 = defpackage.ail.a((int) r6, (java.nio.ByteOrder) r8)     // Catch:{ all -> 0x02df }
            r3.put(r9, r6)     // Catch:{ all -> 0x02df }
        L_0x0260:
            if (r10 == 0) goto L_0x0289
            int r3 = java.lang.Integer.parseInt(r10)     // Catch:{ all -> 0x02df }
            r6 = 90
            if (r3 == r6) goto L_0x0279
            r6 = 180(0xb4, float:2.52E-43)
            if (r3 == r6) goto L_0x0277
            r6 = 270(0x10e, float:3.78E-43)
            if (r3 == r6) goto L_0x0274
            r8 = 1
            goto L_0x027a
        L_0x0274:
            r8 = 8
            goto L_0x027a
        L_0x0277:
            r8 = 3
            goto L_0x027a
        L_0x0279:
            r8 = 6
        L_0x027a:
            java.util.HashMap[] r3 = r1.Q     // Catch:{ all -> 0x02df }
            r3 = r3[r4]     // Catch:{ all -> 0x02df }
            java.lang.String r6 = "Orientation"
            java.nio.ByteOrder r9 = r1.S     // Catch:{ all -> 0x02df }
            ail r8 = defpackage.ail.a((int) r8, (java.nio.ByteOrder) r9)     // Catch:{ all -> 0x02df }
            r3.put(r6, r8)     // Catch:{ all -> 0x02df }
        L_0x0289:
            if (r5 != 0) goto L_0x028d
            goto L_0x01e4
        L_0x028d:
            if (r13 == 0) goto L_0x01e4
            int r3 = java.lang.Integer.parseInt(r5)     // Catch:{ all -> 0x02df }
            int r5 = java.lang.Integer.parseInt(r13)     // Catch:{ all -> 0x02df }
            if (r5 <= r14) goto L_0x02d7
            long r8 = (long) r3     // Catch:{ all -> 0x02df }
            r7.a(r8)     // Catch:{ all -> 0x02df }
            byte[] r6 = new byte[r14]     // Catch:{ all -> 0x02df }
            int r8 = r7.read(r6)     // Catch:{ all -> 0x02df }
            if (r8 != r14) goto L_0x02cf
            int r3 = r3 + r14
            int r5 = r5 + -6
            byte[] r8 = i     // Catch:{ all -> 0x02df }
            boolean r6 = java.util.Arrays.equals(r6, r8)     // Catch:{ all -> 0x02df }
            if (r6 == 0) goto L_0x02c7
            byte[] r6 = new byte[r5]     // Catch:{ all -> 0x02df }
            int r8 = r7.read(r6)     // Catch:{ all -> 0x02df }
            if (r8 != r5) goto L_0x02bf
            r1.U = r3     // Catch:{ all -> 0x02df }
            r1.a((byte[]) r6, (int) r4)     // Catch:{ all -> 0x02df }
            goto L_0x01e4
        L_0x02bf:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x02df }
            java.lang.String r4 = "Can't read exif"
            r3.<init>(r4)     // Catch:{ all -> 0x02df }
            throw r3     // Catch:{ all -> 0x02df }
        L_0x02c7:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x02df }
            java.lang.String r4 = "Invalid identifier"
            r3.<init>(r4)     // Catch:{ all -> 0x02df }
            throw r3     // Catch:{ all -> 0x02df }
        L_0x02cf:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x02df }
            java.lang.String r4 = "Can't read identifier"
            r3.<init>(r4)     // Catch:{ all -> 0x02df }
            throw r3     // Catch:{ all -> 0x02df }
        L_0x02d7:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x02df }
            java.lang.String r4 = "Invalid exif length"
            r3.<init>(r4)     // Catch:{ all -> 0x02df }
            throw r3     // Catch:{ all -> 0x02df }
        L_0x02df:
            r0 = move-exception
            r3 = r0
            r2.release()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            throw r3     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
        L_0x02e5:
            r1.a((defpackage.aik) r7)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.util.HashMap[] r3 = r1.Q     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r3 = r3[r4]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.String r5 = "JpgFromRaw"
            java.lang.Object r3 = r3.get(r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            ail r3 = (defpackage.ail) r3     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r3 != 0) goto L_0x02f7
            goto L_0x02fc
        L_0x02f7:
            int r3 = r1.Y     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r1.a(r7, r3, r13)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
        L_0x02fc:
            java.util.HashMap[] r3 = r1.Q     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r3 = r3[r4]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.String r5 = "ISO"
            java.lang.Object r3 = r3.get(r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            ail r3 = (defpackage.ail) r3     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.util.HashMap[] r5 = r1.Q     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r6 = 1
            r5 = r5[r6]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            ail r5 = (defpackage.ail) r5     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r3 == 0) goto L_0x048a
            if (r5 != 0) goto L_0x048a
            java.util.HashMap[] r5 = r1.Q     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r6 = 1
            r5 = r5[r6]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r5.put(r2, r3)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            goto L_0x048a
        L_0x0321:
            r2 = 84
            r7.skipBytes(r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r2 = 4
            byte[] r3 = new byte[r2]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte[] r5 = new byte[r2]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r7.read(r3)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r7.skipBytes(r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r7.read(r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r3)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r2 = r2.getInt()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r3 = r3.getInt()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r1.a(r7, r2, r13)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            long r2 = (long) r3     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r7.a(r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r7.a = r2     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r2 = r7.readInt()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r3 = 0
        L_0x0354:
            if (r3 >= r2) goto L_0x048a
            int r5 = r7.readUnsignedShort()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r6 = r7.readUnsignedShort()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            aim r8 = B     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r8 = r8.a     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r5 != r8) goto L_0x0388
            short r2 = r7.readShort()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            short r3 = r7.readShort()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.nio.ByteOrder r5 = r1.S     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            ail r2 = defpackage.ail.a((int) r2, (java.nio.ByteOrder) r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.nio.ByteOrder r5 = r1.S     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            ail r3 = defpackage.ail.a((int) r3, (java.nio.ByteOrder) r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.util.HashMap[] r5 = r1.Q     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r5 = r5[r4]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r5.put(r9, r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.util.HashMap[] r2 = r1.Q     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r2 = r2[r4]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r2.put(r11, r3)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            goto L_0x048a
        L_0x0388:
            r7.skipBytes(r6)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r3 = r3 + 1
            goto L_0x0354
        L_0x038e:
            r1.a((defpackage.aik) r7)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.util.HashMap[] r2 = r1.Q     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r3 = 1
            r2 = r2[r3]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.String r3 = "MakerNote"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            ail r2 = (defpackage.ail) r2     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r2 == 0) goto L_0x048a
            aik r3 = new aik     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte[] r2 = r2.c     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r3.<init>((byte[]) r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.nio.ByteOrder r2 = r1.S     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r3.a = r2     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte[] r2 = m     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r2 = r2.length     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r3.readFully(r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r5 = 0
            r3.a(r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte[] r8 = n     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r8 = r8.length     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte[] r8 = new byte[r8]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r3.readFully(r8)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte[] r10 = m     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            boolean r2 = java.util.Arrays.equals(r2, r10)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r2 != 0) goto L_0x03d7
            byte[] r2 = n     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            boolean r2 = java.util.Arrays.equals(r8, r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r2 != 0) goto L_0x03d1
            goto L_0x03dd
        L_0x03d1:
            r5 = 12
            r3.a(r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            goto L_0x03dd
        L_0x03d7:
            r5 = 8
            r3.a(r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
        L_0x03dd:
            r1.b(r3, r14)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.util.HashMap[] r2 = r1.Q     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r3 = 7
            r2 = r2[r3]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.String r3 = "PreviewImageStart"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            ail r2 = (defpackage.ail) r2     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.util.HashMap[] r3 = r1.Q     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r5 = 7
            r3 = r3[r5]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.String r5 = "PreviewImageLength"
            java.lang.Object r3 = r3.get(r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            ail r3 = (defpackage.ail) r3     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r2 != 0) goto L_0x03fe
            goto L_0x0412
        L_0x03fe:
            if (r3 == 0) goto L_0x0412
            java.util.HashMap[] r5 = r1.Q     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r5 = r5[r13]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.String r6 = "JPEGInterchangeFormat"
            r5.put(r6, r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.util.HashMap[] r2 = r1.Q     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r2 = r2[r13]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.String r5 = "JPEGInterchangeFormatLength"
            r2.put(r5, r3)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
        L_0x0412:
            java.util.HashMap[] r2 = r1.Q     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r3 = 8
            r2 = r2[r3]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.String r3 = "AspectFrame"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            ail r2 = (defpackage.ail) r2     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r2 == 0) goto L_0x048a
            java.nio.ByteOrder r3 = r1.S     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.Object r2 = r2.a((java.nio.ByteOrder) r3)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int[] r2 = (int[]) r2     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int[] r2 = (int[]) r2     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r2 != 0) goto L_0x042f
            goto L_0x0469
        L_0x042f:
            int r3 = r2.length     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r5 = 4
            if (r3 != r5) goto L_0x0469
            r3 = 2
            r3 = r2[r3]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r5 = r2[r4]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r3 <= r5) goto L_0x048a
            r6 = 3
            r8 = r2[r6]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r6 = 1
            r2 = r2[r6]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r8 <= r2) goto L_0x048a
            int r3 = r3 - r5
            int r3 = r3 + r6
            int r8 = r8 - r2
            int r8 = r8 + r6
            if (r3 >= r8) goto L_0x044d
            int r3 = r3 + r8
            int r8 = r3 - r8
            int r3 = r3 - r8
            goto L_0x044e
        L_0x044d:
        L_0x044e:
            java.nio.ByteOrder r2 = r1.S     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            ail r2 = defpackage.ail.a((int) r3, (java.nio.ByteOrder) r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.nio.ByteOrder r3 = r1.S     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            ail r3 = defpackage.ail.a((int) r8, (java.nio.ByteOrder) r3)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.util.HashMap[] r5 = r1.Q     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r5 = r5[r4]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r5.put(r11, r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.util.HashMap[] r2 = r1.Q     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r2 = r2[r4]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r2.put(r9, r3)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            goto L_0x048a
        L_0x0469:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r3.<init>()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.String r5 = "Invalid aspect frame values. frame="
            r3.append(r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.String r2 = java.util.Arrays.toString(r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r3.append(r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            android.util.Log.w(r12, r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            goto L_0x048a
        L_0x0482:
            r1.a(r7, r4, r4)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            goto L_0x048a
        L_0x0487:
            r1.a((defpackage.aik) r7)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
        L_0x048a:
            java.util.HashMap[] r2 = r1.Q     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r3 = 4
            r2 = r2[r3]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.String r3 = "Compression"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            ail r3 = (defpackage.ail) r3     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r3 == 0) goto L_0x058d
            java.nio.ByteOrder r5 = r1.S     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r3 = r3.b(r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r5 = 1
            if (r3 == r5) goto L_0x04ae
            if (r3 == r14) goto L_0x04a9
            r5 = 7
            if (r3 == r5) goto L_0x04ae
            goto L_0x0590
        L_0x04a9:
            r1.a((defpackage.aik) r7, (java.util.HashMap) r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            goto L_0x0590
        L_0x04ae:
            java.lang.String r3 = "BitsPerSample"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            ail r3 = (defpackage.ail) r3     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r3 == 0) goto L_0x0590
            java.nio.ByteOrder r5 = r1.S     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.Object r3 = r3.a((java.nio.ByteOrder) r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int[] r3 = (int[]) r3     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int[] r3 = (int[]) r3     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int[] r5 = a     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            boolean r5 = java.util.Arrays.equals(r5, r3)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r5 == 0) goto L_0x04cb
            goto L_0x04f9
        L_0x04cb:
            int r5 = r1.P     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r6 = 3
            if (r5 != r6) goto L_0x0590
            java.lang.String r5 = "PhotometricInterpretation"
            java.lang.Object r5 = r2.get(r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            ail r5 = (defpackage.ail) r5     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r5 == 0) goto L_0x0590
            java.nio.ByteOrder r6 = r1.S     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r5 = r5.b(r6)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r6 = 1
            if (r5 != r6) goto L_0x04ed
            int[] r5 = b     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            boolean r3 = java.util.Arrays.equals(r3, r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r3 != 0) goto L_0x04f9
            goto L_0x0590
        L_0x04ed:
            if (r5 != r14) goto L_0x0590
            int[] r5 = a     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            boolean r3 = java.util.Arrays.equals(r3, r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r3 != 0) goto L_0x04f9
            goto L_0x0590
        L_0x04f9:
            java.lang.String r3 = "StripOffsets"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            ail r3 = (defpackage.ail) r3     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.String r5 = "StripByteCounts"
            java.lang.Object r2 = r2.get(r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            ail r2 = (defpackage.ail) r2     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r3 != 0) goto L_0x050d
            goto L_0x0590
        L_0x050d:
            if (r2 == 0) goto L_0x0590
            java.nio.ByteOrder r5 = r1.S     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.Object r3 = r3.a((java.nio.ByteOrder) r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            long[] r3 = a((java.lang.Object) r3)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.nio.ByteOrder r5 = r1.S     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            java.lang.Object r2 = r2.a((java.nio.ByteOrder) r5)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            long[] r2 = a((java.lang.Object) r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r3 != 0) goto L_0x0526
            goto L_0x0587
        L_0x0526:
            int r5 = r3.length     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r5 == 0) goto L_0x0587
            if (r2 != 0) goto L_0x052c
            goto L_0x0581
        L_0x052c:
            int r6 = r2.length     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r6 == 0) goto L_0x0581
            if (r5 == r6) goto L_0x0537
            java.lang.String r2 = "stripOffsets and stripByteCounts should have same length."
            android.util.Log.w(r12, r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            goto L_0x0590
        L_0x0537:
            r5 = 0
            r12 = 0
        L_0x053a:
            if (r5 < r6) goto L_0x057a
            int r5 = (int) r12     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r8 = 1
            r1.T = r8     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r6 = 0
            r8 = 0
            r9 = 0
        L_0x0545:
            int r10 = r3.length     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r6 >= r10) goto L_0x0573
            r11 = r3[r6]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r12 = (int) r11     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r13 = r2[r6]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r11 = (int) r13     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r10 = r10 + -1
            if (r6 >= r10) goto L_0x0560
            int r10 = r12 + r11
            long r13 = (long) r10     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r10 = r6 + 1
            r15 = r3[r10]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 != 0) goto L_0x055e
            goto L_0x0560
        L_0x055e:
            r1.T = r4     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
        L_0x0560:
            int r12 = r12 - r8
            long r13 = (long) r12     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r7.a(r13)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            byte[] r10 = new byte[r11]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            r7.read(r10)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r8 = r8 + r12
            int r8 = r8 + r11
            java.lang.System.arraycopy(r10, r4, r5, r9, r11)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            int r9 = r9 + r11
            int r6 = r6 + 1
            goto L_0x0545
        L_0x0573:
            boolean r2 = r1.T     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            if (r2 == 0) goto L_0x0590
            r2 = r3[r4]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            goto L_0x0590
        L_0x057a:
            r8 = 1
            r9 = r2[r5]     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            long r12 = r12 + r9
            int r5 = r5 + 1
            goto L_0x053a
        L_0x0581:
            java.lang.String r2 = "stripByteCounts should not be null or have zero length."
            android.util.Log.w(r12, r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            goto L_0x0590
        L_0x0587:
            java.lang.String r2 = "stripOffsets should not be null or have zero length."
            android.util.Log.w(r12, r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
            goto L_0x0590
        L_0x058d:
            r1.a((defpackage.aik) r7, (java.util.HashMap) r2)     // Catch:{ IOException -> 0x059a, all -> 0x0594 }
        L_0x0590:
            r25.a()
            return
        L_0x0594:
            r0 = move-exception
            r2 = r0
            r25.a()
            throw r2
        L_0x059a:
            r0 = move-exception
            goto L_0x0590
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aio.a(java.io.InputStream):void");
    }

    private final void a(byte[] bArr, int i2) {
        aik aik = new aik(bArr);
        a(aik, bArr.length);
        b(aik, i2);
    }

    private static boolean a(FileDescriptor fileDescriptor) {
        int i2 = Build.VERSION.SDK_INT;
        try {
            Os.lseek(fileDescriptor, 0, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception e2) {
            return false;
        }
    }

    private final boolean a(HashMap hashMap) {
        ail ail = (ail) hashMap.get("ImageLength");
        ail ail2 = (ail) hashMap.get("ImageWidth");
        if (ail == null || ail2 == null) {
            return false;
        }
        int b2 = ail.b(this.S);
        int b3 = ail2.b(this.S);
        if (b2 > 512 || b3 > 512) {
            return false;
        }
        return true;
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static long[] a(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    public final int a(String str, int i2) {
        ail b2 = b(str);
        if (b2 != null) {
            try {
                return b2.b(this.S);
            } catch (NumberFormatException e2) {
            }
        }
        return i2;
    }

    public final String a(String str) {
        double d2;
        ail b2 = b(str);
        if (b2 == null) {
            return null;
        }
        if (!J.contains(str)) {
            return b2.c(this.S);
        }
        if (str.equals("GPSTimeStamp")) {
            int i2 = b2.a;
            if (i2 == 5 || i2 == 10) {
                ain[] ainArr = (ain[]) b2.a(this.S);
                if (ainArr != null && ainArr.length == 3) {
                    ain ain = ainArr[0];
                    ain ain2 = ainArr[1];
                    ain ain3 = ainArr[2];
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) ain.a) / ((float) ain.b))), Integer.valueOf((int) (((float) ain2.a) / ((float) ain2.b))), Integer.valueOf((int) (((float) ain3.a) / ((float) ain3.b)))});
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(ainArr));
                return null;
            }
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + b2.a);
            return null;
        }
        try {
            Object a2 = b2.a(this.S);
            if (a2 != null) {
                if (a2 instanceof String) {
                    d2 = Double.parseDouble((String) a2);
                } else if (a2 instanceof long[]) {
                    long[] jArr = (long[]) a2;
                    if (jArr.length == 1) {
                        d2 = (double) jArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (a2 instanceof int[]) {
                    int[] iArr = (int[]) a2;
                    if (iArr.length == 1) {
                        d2 = (double) iArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (a2 instanceof double[]) {
                    double[] dArr = (double[]) a2;
                    if (dArr.length == 1) {
                        d2 = dArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (a2 instanceof ain[]) {
                    ain[] ainArr2 = (ain[]) a2;
                    if (ainArr2.length == 1) {
                        ain ain4 = ainArr2[0];
                        double d3 = (double) ain4.a;
                        double d4 = (double) ain4.b;
                        Double.isNaN(d3);
                        Double.isNaN(d4);
                        d2 = d3 / d4;
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                return Double.toString(d2);
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        } catch (NumberFormatException e2) {
            return null;
        }
    }
}
