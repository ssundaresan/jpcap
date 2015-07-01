// $Id: IPFields.java,v 1.4 2001/06/27 01:46:59 pcharles Exp $

/***************************************************************************
 * Copyright (C) 2001, Patrick Charles and Jonas Lehmann                   *
 * Distributed under the Mozilla Public License                            *
 *   http://www.mozilla.org/NPL/MPL-1.1.txt                                *
 ***************************************************************************/
package net.sourceforge.jpcap.net;


/**
 * IP protocol field encoding information.
 *
 * @author Patrick Charles and Jonas Lehmann
 * @version $Revision: 1.4 $
 * @lastModifiedBy $Author: pcharles $
 * @lastModifiedAt $Date: 2001/06/27 01:46:59 $
 */
public interface IPFields
{
  // field lengths

  /**
   * Width of the IP version and header length field in bytes.
   */
  int IP_VER_LEN = 1;

  /**
   * Width of the TOS field in bytes.
   */
  int IP_TOS_LEN = 1;
  int IP6_TOS_LEN = 2;

  /**
   * Width of the header length field in bytes.
   */
  int IP_LEN_LEN = 2;
  int IP6_LEN_LEN = 2;

  /**
   * Width of the flow label length field in bytes.
   */
  int IP6_FLOWLABEL_LEN = 2;

  /**
   * Width of the ID field in bytes.
   */
  int IP_ID_LEN = 2;

  /**
   * Width of the fragmentation bits and offset field in bytes.
   */
  int IP_FRAG_LEN = 2;

  /**
   * Width of the fragmentation bits and offset field in bytes.
   */
  int IP6_NEXTHEADER_LEN = 1;

  /**
   * Width of the TTL field in bytes.
   */
  int IP_TTL_LEN = 1;
  int IP6_TTL_LEN = 1;

  /**
   * Width of the IP protocol code in bytes.
   */
  int IP_CODE_LEN = 1;

  /**
   * Width of the IP checksum in bytes.
   */
  int IP_CSUM_LEN = 2;


  // field positions

  /**
   * Position of the version code and header length within the IP header.
   */
  int IP_VER_POS = 0;

  /**
   * Position of the type of service code within the IP header.
   */
  int IP_TOS_POS = IP_VER_POS + IP_VER_LEN;
  int IP6_TOS_POS = 0;

  /**
   * Position of the length within the IP header.
   */
  int IP_LEN_POS = IP_TOS_POS + IP_TOS_LEN;
  int IP6_LEN_POS = IP6_TOS_POS + IP6_TOS_LEN + IP6_FLOWLABEL_LEN;

  /**
   * Position of the packet ID within the IP header.
   */
  int IP_ID_POS = IP_LEN_POS + IP_LEN_LEN;

  /**
   * Position of the flag bits and fragment offset within the IP header.
   */
  int IP_FRAG_POS = IP_ID_POS + IP_ID_LEN;

  /**
   * Position of the next header offset within the IP header.
   */
  int IP6_NEXTHEADER_POS = IP6_LEN_POS + IP6_LEN_LEN;

  /**
   * Position of the ttl within the IP header.
   */
  int IP_TTL_POS = IP_FRAG_POS + IP_FRAG_LEN;
  int IP6_TTL_POS = IP6_NEXTHEADER_POS + IP6_NEXTHEADER_LEN;

  /**
   * Position of the IP protocol code within the IP header.
   */
  int IP_CODE_POS = IP_TTL_POS + IP_TTL_LEN;

  /**
   * Position of the checksum within the IP header.
   */
  int IP_CSUM_POS = IP_CODE_POS + IP_CODE_LEN;

  /**
   * Position of the source IP address within the IP header.
   */
  int IP_SRC_POS = IP_CSUM_POS + IP_CSUM_LEN;
  int IP6_SRC_POS = IP6_TTL_POS + IP6_TTL_LEN;

  /**
   * Position of the destination IP address within a packet.
   */
  int IP_DST_POS = IP_SRC_POS + IPAddress.WIDTH;
  int IP6_DST_POS = IP6_SRC_POS + IPAddress.WIDTH6;


  // complete header length 

  /**
   * Length in bytes of an IP header, excluding options.
   */
  int IP_HEADER_LEN = IP_DST_POS + IPAddress.WIDTH; // == 20
  int IP6_HEADER_LEN = IP6_DST_POS + IPAddress.WIDTH6; // == 40
}
