PGDMP             
             {            TCBS    15.1    15.1                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16394    TCBS    DATABASE     h   CREATE DATABASE "TCBS" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'C';
    DROP DATABASE "TCBS";
                postgres    false                       0    0    DATABASE "TCBS"    COMMENT     )   COMMENT ON DATABASE "TCBS" IS 'example';
                   postgres    false    3601            �            1259    16517    category    TABLE     Z   CREATE TABLE public.category (
    id bigint NOT NULL,
    name character varying(255)
);
    DROP TABLE public.category;
       public         heap    postgres    false            �            1259    16522    category_seq    SEQUENCE     v   CREATE SEQUENCE public.category_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.category_seq;
       public          postgres    false            �            1259    16395    stock    TABLE     g   CREATE TABLE public.stock (
    name text,
    category_id integer NOT NULL,
    id bigint NOT NULL
);
    DROP TABLE public.stock;
       public         heap    postgres    false                       0    0    COLUMN stock.name    COMMENT     8   COMMENT ON COLUMN public.stock.name IS 'Tên công ty';
          public          postgres    false    214            �            1259    16523    stock_id_seq    SEQUENCE     �   ALTER TABLE public.stock ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.stock_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    214            �            1259    16531 	   stock_seq    SEQUENCE     s   CREATE SEQUENCE public.stock_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
     DROP SEQUENCE public.stock_seq;
       public          postgres    false                      0    16517    category 
   TABLE DATA           ,   COPY public.category (id, name) FROM stdin;
    public          postgres    false    215   H                 0    16395    stock 
   TABLE DATA           6   COPY public.stock (name, category_id, id) FROM stdin;
    public          postgres    false    214   �                  0    0    category_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.category_seq', 301, true);
          public          postgres    false    216                       0    0    stock_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.stock_id_seq', 11, true);
          public          postgres    false    217                       0    0 	   stock_seq    SEQUENCE SET     7   SELECT pg_catalog.setval('public.stock_seq', 1, true);
          public          postgres    false    218            x           2606    16521    category category_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.category
    ADD CONSTRAINT category_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.category DROP CONSTRAINT category_pkey;
       public            postgres    false    215            v           2606    16530    stock stock_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.stock
    ADD CONSTRAINT stock_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.stock DROP CONSTRAINT stock_pkey;
       public            postgres    false    214               �   x����0���S� R�W�.P���h�&J�H��?�ɲ��rGWI;z�<E���K|��@�Re[ӌ#Rxi���� ����� Y�	�}�i�U۶S*̖�]���3���`:z�0z��m��$� ��*j         c   x��;� ��z�0�UT,� ��#B����!�����L<1q���!�`R�8�@]���M��r���Q$���I�둪�x�5g9�q;�/�Ţ��d�� � 5��     