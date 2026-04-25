package com.devluanm.noto.network;

public class Concepts {

	static void main(String[] args) {
		System.out.println("""
			HTTP: Hyper Text Transfer Protocol
			HTTPS: Hyper Text Transfer Protocol Secure
			DNS: Domain Name System
			DNS Record: Types A for ipv4, AAAA for ipv6, MX
			DNS Queries: Asks for a record to an DNS Resolver
			TCP/IP: Transmission Control Protocol/Internet Protocol - Divides the information into small packets, control
			control the order of the packets, handshake and error checking and retry
			Packets: Small pieces of data that are sent over the network
			IP: Internet Protocol - Identifies the device, the router uses to identify the device and to where sent the information
			UDP: User Datagram Protocol - Sends information without guarantee of delivery - faster than TCP but with less reliability
			Socket: IP address + port number, to serve multiple applications on the same server
			HTTP Methods: GET, POST, PUT, DELETE, HEAD, OPTIONS, TRACE, PATCH
			HEAD: Same that GET but without the body content, only the headers
			OPTIONS: To identify what methods are supported by a resource
			URI: Uniform Resource Identifier - Identifies the resource, general identifier. e.g -> https://example.com/index.html
			- URI = a person’s name or ID
			URL: Uniform Resource Locator - Identifies the resource and the server. A type of URI. e.g -> https://example.com/index.html
			- Protocol: HTTP, HTTPS, FTP
			- Domain: example.com
			- Resource path: /index.html
			- URL = their home address (tells you exactly where to go)
			""");
	}
}