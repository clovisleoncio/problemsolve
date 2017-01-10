#!/usr/bin/env python

class Node(object):
	def __init__(self, data = None, next_node = None):
		self.data = data
		self.next = next_node

def has_cycle(head):

	node = head

	nodes = []

	while node.next:
		if node in nodes:
			return True
		nodes.append(node)
		node = node.next

	return False


node3 = Node('3')
node2 = Node('2', node3)
node1 = Node('1', node2)
node3.next = node2

print has_cycle(node1)